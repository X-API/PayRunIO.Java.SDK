package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PensionPayInstruction")
public class PensionPayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="EmployeeContributionCash")
    public java.math.BigDecimal employeeContributionCash;

    @JsonProperty(value="EmployerContributionCash")
    public java.math.BigDecimal employerContributionCash;

    @JsonProperty(value="EmployeeContributionPercent")
    public java.math.BigDecimal employeeContributionPercent;

    @JsonProperty(value="EmployerContributionPercent")
    public java.math.BigDecimal employerContributionPercent;

    @JsonProperty(value="AdditionalVoluntaryContributionCash")
    public java.math.BigDecimal additionalVoluntaryContributionCash;

    @JsonProperty(value="AdditionalVoluntaryContributionPercent")
    public java.math.BigDecimal additionalVoluntaryContributionPercent;

    @JsonProperty(value="LowerThreshold")
    public java.math.BigDecimal lowerThreshold;

    @JsonProperty(value="UpperThreshold")
    public java.math.BigDecimal upperThreshold;

    @JsonProperty(value="SalarySacrifice")
    public Boolean salarySacrifice;

    @JsonProperty(value="TaxationMethod")
    public PensionTaxationMethod taxationMethod;

    @JsonProperty(value="ProRataMethod")
    public ProRataMethod proRataMethod;

    @JsonProperty(value="Pension")
    public Link pension;
}
