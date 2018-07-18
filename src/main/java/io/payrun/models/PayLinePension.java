package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLinePension")
public class PayLinePension extends PayLine
{

    @JsonProperty(value="TaxationMethod")
    public PensionTaxationMethod taxationMethod = PensionTaxationMethod.NotSet;

    @JsonProperty(value="EmployerContribution")
    public java.lang.Double employerContribution = 0d;;

    @JsonProperty(value="PensionablePay")
    public java.lang.Double pensionablePay = 0d;;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="ContributionDeductionDate")
    public java.util.Date contributionDeductionDate;

    @JsonProperty(value="EmployerContributionPercent")
    public java.lang.Double employerContributionPercent;

    @JsonProperty(value="EmployeeContributionPercent")
    public java.lang.Double employeeContributionPercent;

    @JsonProperty(value="EmployeeAdditionalVoluntaryCash")
    public java.lang.Double employeeAdditionalVoluntaryCash;

    @JsonProperty(value="EmployeeAdditionalVoluntaryPercent")
    public java.lang.Double employeeAdditionalVoluntaryPercent;

    @JsonProperty(value="EmployerContributionCash")
    public java.lang.Double employerContributionCash;

    @JsonProperty(value="EmployeeContributionCash")
    public java.lang.Double employeeContributionCash;
}
