package io.payrun.models;

import io.payrun.helpers.SerializerHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class EmployeeTest {

    private SerializerHelper serializerHelper;

    @BeforeEach
    void setUp() {
        serializerHelper = new SerializerHelper();
    }

    @Test
    public void givenSerialisedEmployee_WhenDesrializing_ThenExpectedObjectCreated(){
        String data = "{\"Employee\":{\"Code\":\"EMP001\",\"FirstName\":\"Terry\",\"LastName\":\"Tester\",\"DateOfBirth\":\"1960-01-01\",\"DirectorshipAppointmentDate\":null,\"Gender\":\"Male\",\"NicLiability\":\"IsFullyLiable\",\"Region\":\"England\",\"Territory\":\"UnitedKingdom\",\"PaySchedule\":{\"@title\":\"SCH001: [My Monthly:Monthly]\",\"@href\":\"/Employer/ER001/PaySchedule/SCH001\",\"@rel\":\"PaySchedule\"},\"StartDate\":\"2017-01-01\",\"StarterDeclaration\":\"A\",\"LeavingDate\":null,\"LeaverReason\":null,\"RuleExclusions\":\"None\",\"WorkingWeek\":\"AllWeekDays\",\"Address\":{\"Address1\":\"House\",\"Address2\":\"Street\",\"Address3\":\"Town\",\"Address4\":\"County\",\"Postcode\":\"TE1 1ST\",\"Country\":\"United Kingdom\"},\"HoursPerWeek\":\"0.0000\",\"Seconded\":\"NotSet\",\"EEACitizen\":\"false\",\"EPM6\":\"false\",\"PaymentToANonIndividual\":\"false\",\"IrregularEmployment\":\"false\",\"OnStrike\":\"false\",\"PaymentMethod\":\"NotSet\",\"MaritalStatus\":\"NotSet\",\"IsAgencyWorker\":\"false\",\"Deactivated\":\"false\",\"EffectiveDate\":\"2017-04-01\",\"Revision\":\"1\"}}";

        Employee result = serializerHelper.fromJson(data, Employee.class);

        Assertions.assertEquals(result.code, "EMP001");
    }

    @Test
    public void givenEmployeeInstance_WhenSerialising_ThenExpectedJsonCreated()
    {
        Employee employee = createEmployee();

        String result = serializerHelper.toJson(employee);

        System.out.println(result);
        Assertions.assertNotNull(result);
    }

    @Test
    public void givenEmployee_WhenSerialising_AndDesrializing_ThenDataIsAsExpected(){
        Employee employee = createEmployee();

        String resultA = serializerHelper.toJson(employee);

        Employee employeeB = serializerHelper.fromJson(resultA, Employee.class);

        // field has default value "false" and employee had it set to null, so resultA does NOT contain that field
        assertFalse(employeeB.deactivated);

        // setting deactivated back to null to mimick previous test version expectation
        employeeB.deactivated = null;
        
        String resultB = serializerHelper.toJson(employeeB);

        System.out.println(resultA);
        System.out.println(resultB);

        Assertions.assertEquals(resultA, resultB);
    }

    private Employee createEmployee() {
        Employee employee = new Employee();

        final Address address = new Address();
        address.address1 = "Address 1";
        address.address2 = "Address 2";
        address.address3 = "Address 3";
        address.address4 = "Address 4";
        address.postcode = "TN26 1ND";
        employee.address = address;

        employee.aEAssessmentOverride = AEAssessmentOverride.CeasedMembership;
        employee.aEAssessmentOverrideDate = createDate(2017, 4, 6);
        employee.aEPostponementDate = createDate(2018, 1, 1);

        final BankAccount bankAccount = new BankAccount();
        bankAccount.accountName = "Account Name";
        bankAccount.accountNumber = "12345678";
        bankAccount.sortCode = "012345";
        employee.bankAccount = bankAccount;

        employee.code = "EMP001";
        employee.dateOfBirth  = createDate(1970, 1, 31);
        employee.deactivated = null;
        employee.eEACitizen = false;
        employee.effectiveDate = createDate(0001,1,1);
        employee.directorshipAppointmentDate = createDate(2018, 6,15);

        final EmployeePartner employeePartner = new EmployeePartner();
        employeePartner.firstName = "FirstName";
        employeePartner.initials = "PPP";
        employeePartner.lastName = "LastName";
        employeePartner.middleName = "MiddleName";
        employeePartner.niNumber = "AB123456A";
        employee.employeePartner = employeePartner;

        employee.ePM6 = true;
        employee.firstName = "Terry";
        employee.middleName = "T";
        employee.lastName = "Tester";
        employee.initials = "TTT";
        employee.passportNumber = "TES0123456789TEST";
        employee.gender = Gender.Male;
        employee.hoursPerWeek = Double.valueOf(37.5);
        employee.irregularEmployment = false;
        employee.isAgencyWorker = false;
        employee.leaverReason = LeaverReason.Other;
        employee.leavingDate = createDate(2018,1,1);
        employee.niNumber = "AB654321B";
        employee.maritalStatus = MaritalStatus.NotSet;
        employee.nicLiability = NicLiability.IsFullyLiable.toString();
        employee.onStrike = true;
        employee.paymentMethod = PaymentMethod.Cheque;

        final Link paySchedule = new Link();
        paySchedule.title = "Title";
        paySchedule.targetType = PaySchedule.class.getName();
        paySchedule.href = "/Employee/ER001/PaySchedule/SCH001";
        employee.paySchedule = paySchedule;

        employee.paymentToANonIndividual = false;
        employee.region = CalculatorRegion.England;
        employee.territory = CalculatorTerritory.UnitedKingdom;
        employee.ruleExclusions = RuleExclusionFlags.None.toString();
        employee.seconded = EmployeeSecondment.NotSet;
        employee.startDate = createDate(1995,4,6);
        employee.title = "Mr";
        employee.workingWeek = WorkingWeek.Monday.toString() + "|" + WorkingWeek.Tuesday.toString() + "|" + WorkingWeek.Wednesday.toString();
        return employee;
    }

    private Date createDate(int year, int month, int day)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(0);
        cal.set(year, month, day);
        return cal.getTime();
    }
}
