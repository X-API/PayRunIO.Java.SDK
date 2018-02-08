package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Employer")
public class Employer
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EffectiveDate")
    public java.util.Date effectiveDate;

    @JsonProperty(value="Revision")
    public java.lang.Integer revision;

    @JsonProperty(value="Name")
    public String name;

    @JsonProperty(value="Region")
    public CalculatorRegion region = CalculatorRegion.NotSet;

    @JsonProperty(value="Territory")
    public CalculatorTerritory territory = CalculatorTerritory.NotSet;

    @JsonProperty(value="BacsServiceUserNumber")
    public String bacsServiceUserNumber;

    @JsonProperty(value="RuleExclusions")
    public String ruleExclusions = "None";

    @JsonProperty(value="ClaimEmploymentAllowance")
    public Boolean claimEmploymentAllowance = false;

    @JsonProperty(value="ClaimSmallEmployerRelief")
    public Boolean claimSmallEmployerRelief = false;

    @JsonProperty(value="ApprenticeshipLevyAllowance")
    public java.lang.Double apprenticeshipLevyAllowance = 0d;;

    @JsonProperty(value="Address")
    public Address address;

    @JsonProperty(value="HmrcSettings")
    public HmrcSettings hmrcSettings;

    @JsonProperty(value="BankAccount")
    public BankAccount bankAccount;

    @JsonProperty(value="AutoEnrolment")
    public EmployerAutoEnrolment autoEnrolment;
}
