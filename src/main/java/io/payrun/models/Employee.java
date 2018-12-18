package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Employee")
public class Employee
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EffectiveDate")
    public java.util.Date effectiveDate;

    @JsonProperty(value="Revision")
    public java.lang.Integer revision;

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="Title")
    public String title;

    @JsonProperty(value="FirstName")
    public String firstName;

    @JsonProperty(value="MiddleName")
    public String middleName;

    @JsonProperty(value="Initials")
    public String initials;

    @JsonProperty(value="LastName")
    public String lastName;

    @JsonProperty(value="NiNumber")
    public String niNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="DateOfBirth")
    public java.util.Date dateOfBirth;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="DirectorshipAppointmentDate")
    public java.util.Date directorshipAppointmentDate;

    @JsonProperty(value="Gender")
    public Gender gender = Gender.Unknown;

    @JsonProperty(value="NicLiability")
    public String nicLiability = "IsFullyLiable";

    @JsonProperty(value="Region")
    public CalculatorRegion region = CalculatorRegion.NotSet;

    @JsonProperty(value="Territory")
    public CalculatorTerritory territory = CalculatorTerritory.NotSet;

    @JsonProperty(value="PaySchedule")
    public Link paySchedule;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonProperty(value="StarterDeclaration")
    public StarterDeclaration starterDeclaration;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="LeavingDate")
    public java.util.Date leavingDate;

    @JsonProperty(value="LeaverReason")
    public LeaverReason leaverReason;

    @JsonProperty(value="RuleExclusions")
    public String ruleExclusions = "None";

    @JsonProperty(value="WorkingWeek")
    public String workingWeek = "None";

    @JsonProperty(value="Address")
    public Address address;

    @JsonProperty(value="HoursPerWeek")
    public java.math.BigDecimal hoursPerWeek = new java.math.BigDecimal(0);;

    @JsonProperty(value="PassportNumber")
    public String passportNumber;

    @JsonProperty(value="Seconded")
    public EmployeeSecondment seconded = EmployeeSecondment.NotSet;

    @JsonProperty(value="EEACitizen")
    public Boolean eEACitizen = false;

    @JsonProperty(value="EPM6")
    public Boolean ePM6 = false;

    @JsonProperty(value="PaymentToANonIndividual")
    public Boolean paymentToANonIndividual = false;

    @JsonProperty(value="IrregularEmployment")
    public Boolean irregularEmployment = false;

    @JsonProperty(value="OnStrike")
    public Boolean onStrike = false;

    @JsonProperty(value="PaymentMethod")
    public PaymentMethod paymentMethod = PaymentMethod.NotSet;

    @JsonProperty(value="MaritalStatus")
    public MaritalStatus maritalStatus = MaritalStatus.NotSet;

    @JsonProperty(value="BankAccount")
    public BankAccount bankAccount;

    @JsonProperty(value="EmployeePartner")
    public EmployeePartner employeePartner;

    @JsonProperty(value="IsAgencyWorker")
    public Boolean isAgencyWorker = false;

    @JsonProperty(value="Deactivated")
    public Boolean deactivated = false;

    @JsonProperty(value="AEAssessmentOverride")
    public AEAssessmentOverride aEAssessmentOverride = AEAssessmentOverride.None;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AEAssessmentOverrideDate")
    public java.util.Date aEAssessmentOverrideDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AEPostponementDate")
    public java.util.Date aEPostponementDate;
}
