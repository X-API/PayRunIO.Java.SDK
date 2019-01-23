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
    public java.math.BigDecimal employerContribution = new java.math.BigDecimal(0);

    @JsonProperty(value="PensionablePay")
    public java.math.BigDecimal pensionablePay = new java.math.BigDecimal(0);

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="ContributionDeductionDate")
    public java.util.Date contributionDeductionDate;

    @JsonProperty(value="EmployerContributionPercent")
    public java.math.BigDecimal employerContributionPercent;

    @JsonProperty(value="EmployeeContributionPercent")
    public java.math.BigDecimal employeeContributionPercent;

    @JsonProperty(value="EmployeeAdditionalVoluntaryCash")
    public java.math.BigDecimal employeeAdditionalVoluntaryCash;

    @JsonProperty(value="EmployeeAdditionalVoluntaryPercent")
    public java.math.BigDecimal employeeAdditionalVoluntaryPercent;

    @JsonProperty(value="EmployerContributionCash")
    public java.math.BigDecimal employerContributionCash;

    @JsonProperty(value="EmployeeContributionCash")
    public java.math.BigDecimal employeeContributionCash;
}
