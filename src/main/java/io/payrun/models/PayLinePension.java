package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLinePension")
public class PayLinePension
{

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Calculator")
    public String calculator;

    @JsonProperty(value="Generated")
    public java.util.Date generated;

    @JsonProperty(value="PayCode")
    public String payCode;

    @JsonProperty(value="PayCodeType")
    public SystemCodeType payCodeType = SystemCodeType.NotSet;

    @JsonProperty(value="Value")
    public java.lang.Double value = Double.valueOf(0);;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PaymentDate")
    public java.util.Date paymentDate;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxPeriod")
    public java.lang.Short taxPeriod;

    @JsonProperty(value="TaxationMethod")
    public PensionTaxationMethod taxationMethod = PensionTaxationMethod.NotSet;

    @JsonProperty(value="EmployerContribution")
    public java.lang.Double employerContribution = Double.valueOf(0);;

    @JsonProperty(value="PensionablePay")
    public java.lang.Double pensionablePay = Double.valueOf(0);;

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
