package io.payrun;

import io.payrun.helpers.RequestHelper;
import io.payrun.models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;

public class SimplePayroll {
    public void Execute(RequestHelper requestHelper) {
        // Step 1: Create employer
        System.out.println("Step 1: Create employer");
        Employer employer = createEmployer();
        Link employerLink = new Link();
        employerLink.href = "/Employer/" + UUID.randomUUID().toString();
        requestHelper.put(employerLink.href, employer);
        System.out.format("CREATED: %s - %s\n", employerLink.title, employerLink.href);

        // Step 2: Create pay schedule
        System.out.println("Step 2: Create pay schedule");
        PaySchedule paySchedule = createPaySchedule();
        Link payScheduleLink = requestHelper.post(employerLink.href + "/PaySchedules", paySchedule);
        System.out.format("CREATED: %s - %s\n", payScheduleLink.title, payScheduleLink.href);

        // Step 3: Create employee
        System.out.println("Step 3: Create employee");
        Employee employee = createEmployee(payScheduleLink);
        Link employeeLink = requestHelper.post(employerLink.href + "/Employees", employee);
        System.out.format("CREATED: %s - %s\n", employeeLink.title, employeeLink.href);

        // Step 4: Create pay instruction (Salary)
        System.out.println("Step 4: Create pay instruction (Salary)");
        SalaryPayInstruction salaryPayInstruction = createSalaryPayInstruction();
        Link salaryPayInstructionLink = requestHelper.post(employeeLink.href + "/PayInstructions", salaryPayInstruction);
        System.out.format("CREATED: %s - %s\n", salaryPayInstructionLink.title, salaryPayInstructionLink.href);

        // Step 5: Create pay run job instruction
        System.out.println("Step 5: Create pay run job instruction");
        PayRunJobInstruction payRunJob = createPayRunJobInstruction(payScheduleLink);
        Link jobInfoLink = requestHelper.post("/jobs/payruns", payRunJob);
        System.out.format("CREATED: %s - %s\n", jobInfoLink.title, jobInfoLink.href);

        // Step 6: Query pay run job status
        System.out.println("Step 6: Query pay run job status");
        if (!waitForJobCompletion(requestHelper, jobInfoLink))
        {
            return;
        }

        // Step 7: Get the Employee Payslip
        System.out.println("Step 7: Get the Employee Payslip");
        final String[] employerHrefSplit = employerLink.href.split("/");
        String employerKey = employerHrefSplit[employerHrefSplit.length - 1];
        String payslipReport = requestHelper.getRaw("/Report/PAYSLIP/run?EmployerKey=" + employerKey + "&TaxYear=2018&TaxPeriod=1");
        System.out.println(payslipReport);

        // Step 8: Review Calculation Commentary
        System.out.println("Step 8: Review Calculation Commentary");
        String commentary = requestHelper.getRaw(employeeLink.href + "/Commentary/C001").replaceAll("\\\\r\\\\n", "\n");
        System.out.println(commentary);

        // Step 9: Create RTI FPS submission Job
        System.out.println("Step 9: Create RTI FPS submission Job");
        RtiJobInstruction fpsJobInstruction = createRtiJobInstruction(employerLink, payScheduleLink);
        Link fpsJobInfoLink = requestHelper.post("/jobs/rti", fpsJobInstruction);

        // Step 10: Query RTI Job Status
        System.out.println("Step 10: Query RTI Job Status");
        waitForJobCompletion(requestHelper, fpsJobInfoLink);

        // Step 11: Review FPS transmission results
        System.out.println("Step 11: Review FPS transmission results");
        LinkCollection rtiLinks = requestHelper.get(employerLink.href + "/RtiTransactions", LinkCollection.class);
        Link fpsLink = rtiLinks.getLinks().get(0);
        RtiFpsTransaction fpsTransaction = requestHelper.get(fpsLink.href, RtiFpsTransaction.class);
        System.out.println(fpsTransaction.requestData.value);
        System.out.println(fpsTransaction.responseData.value);
    }

    private RtiJobInstruction createRtiJobInstruction(Link employerLink, Link payScheduleLink) {
        RtiJobInstruction fpsJobInstruction = new RtiJobInstruction();
        fpsJobInstruction.rtiType = "FPS";
        fpsJobInstruction.generate = true;
        fpsJobInstruction.transmit = true;
        fpsJobInstruction.taxYear = 2018;
        fpsJobInstruction.employer = employerLink;
        fpsJobInstruction.paySchedule = payScheduleLink;
        fpsJobInstruction.paymentDate = createDate("2018-04-30");
        fpsJobInstruction.timestamp = createDate("2018-04-30");
        return fpsJobInstruction;
    }

    private boolean waitForJobCompletion(RequestHelper requestHelper, Link jobInfoLink)
    {
        while (true){
            JobInfo jobInfo = requestHelper.get(jobInfoLink.href, JobInfo.class);

            System.out.println("Job status: " + jobInfo.jobStatus);

            if (jobInfo.jobStatus == JobStatus.Success)
            {
                return true;
            }

            if (jobInfo.jobStatus == JobStatus.Failed)
            {
                for (String error:  jobInfo.getErrors()) {
                    System.out.println(error);
                }

                return false;
            }

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private PayRunJobInstruction createPayRunJobInstruction(Link payScheduleLink) {
        PayRunJobInstruction payRunJob = new PayRunJobInstruction();
        payRunJob.paymentDate = createDate("2018-04-30");
        payRunJob.startDate = createDate("2018-04-01");
        payRunJob.endDate = createDate("2018-04-30");
        payRunJob.paySchedule = payScheduleLink;
        return payRunJob;
    }

    private SalaryPayInstruction createSalaryPayInstruction() {
        SalaryPayInstruction salaryPayInstruction = new SalaryPayInstruction();
        salaryPayInstruction.startDate = createDate("2018-04-01");
        salaryPayInstruction.annualSalary = Double.valueOf(25000.00);;
        return salaryPayInstruction;
    }

    private Employee createEmployee(Link payScheduleLink) {
        Employee employee = new Employee();

        employee.revision = 0;
        employee.effectiveDate = createDate("2018-04-01");
        employee.code = "EMP001";
        employee.title = "Mr";
        employee.firstName = "Terry";
        employee.middleName = "T";
        employee.lastName = "Tester";
        employee.initials = "TTT";
        employee.niNumber = "AA000000A";
        employee.dateOfBirth = createDate("1980-01-01");
        employee.gender = Gender.Male;
        employee.nicLiability = NicLiability.IsFullyLiable.toString();
        employee.region = CalculatorRegion.England;
        employee.territory = CalculatorTerritory.UnitedKingdom;
        employee.paySchedule = payScheduleLink;
        employee.startDate = createDate("2018-04-06");
        employee.starterDeclaration = StarterDeclaration.A;
        employee.ruleExclusions = RuleExclusionFlags.None.toString();
        employee.workingWeek = WorkingWeek.AllWeekDays.toString();

        employee.address = new Address();
        employee.address.address1 = "House";
        employee.address.address2 = "Street";
        employee.address.address3 = "Town";
        employee.address.address4 = "County";
        employee.address.postcode = "TE1 1ST";
        employee.address.country = "United Kingdom";

        employee.hoursPerWeek = Double.valueOf(40);;
        employee.passportNumber = "123457890";
        employee.bankAccount = new BankAccount();
        employee.bankAccount.accountName = "Mr T Tester";
        employee.bankAccount.accountNumber = "12345678";
        employee.bankAccount.sortCode = "012345";

        employee.employeePartner = new EmployeePartner();
        employee.employeePartner.firstName = "Teresa";
        employee.employeePartner.middleName = "T";
        employee.employeePartner.initials = "TTT";
        employee.employeePartner.lastName = "Tester";
        employee.employeePartner.niNumber = "AB000000A";
        return employee;
    }

    private PaySchedule createPaySchedule() {
        PaySchedule paySchedule = new PaySchedule();
        paySchedule.name = "My Monthly";
        paySchedule.payFrequency = PayFrequency.Monthly;
        return paySchedule;
    }

    private Employer createEmployer() {
        Employer employer = new Employer();

        employer.revision = 0;
        employer.effectiveDate = createDate("2018-01-01");
        employer.name = "Getting Started Co Ltd";
        employer.bacsServiceUserNumber = "123456";
        employer.ruleExclusions = RuleExclusionFlags.None.toString();
        employer.territory = CalculatorTerritory.UnitedKingdom;
        employer.region = CalculatorRegion.England;

        employer.address = new Address();
        employer.address.address1 = "House";
        employer.address.address2 = "Street";
        employer.address.address3 = "Town";
        employer.address.address4 = "County";
        employer.address.postcode = "TE1 1ST";
        employer.address.country = "United Kingdom";

        employer.hmrcSettings = new HmrcSettings();
        employer.hmrcSettings.taxOfficeNumber = "451";
        employer.hmrcSettings.taxOfficeReference = "A451";
        employer.hmrcSettings.accountingOfficeRef = "123PA1234567X";
        employer.hmrcSettings.sender = Sender.Employer;
        employer.hmrcSettings.senderId = "ISV451";
        employer.hmrcSettings.password = "testing1";
        employer.hmrcSettings.contactFirstName = "Joe";
        employer.hmrcSettings.contactLastName = "Bloggs";
        employer.hmrcSettings.contactEmail = "Jow.Bloggs@PayRunIO.co.uk";
        employer.hmrcSettings.contactTelephone = "01234567890";
        employer.hmrcSettings.contactFax = "01234567890";

        employer.bankAccount = new BankAccount();
        employer.bankAccount.accountName = "Getting St";
        employer.bankAccount.accountNumber = "12345678";
        employer.bankAccount.sortCode = "012345";
        return employer;
    }

    private Date createDate(String dateAsString)
    {
        try {
            final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

            final Date date = dateFormat.parse(dateAsString);

            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }
}
