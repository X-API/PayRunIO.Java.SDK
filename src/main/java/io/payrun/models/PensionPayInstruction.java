package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PensionPayInstruction")
public class PensionPayInstruction extends PayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="EmployeeContributionCash")
    public java.lang.Double employeeContributionCash;

    @JsonProperty(value="EmployerContributionCash")
    public java.lang.Double employerContributionCash;

    @JsonProperty(value="EmployeeContributionPercent")
    public java.lang.Double employeeContributionPercent;

    @JsonProperty(value="EmployerContributionPercent")
    public java.lang.Double employerContributionPercent;

    @JsonProperty(value="AdditionalVoluntaryContributionCash")
    public java.lang.Double additionalVoluntaryContributionCash;

    @JsonProperty(value="AdditionalVoluntaryContributionPercent")
    public java.lang.Double additionalVoluntaryContributionPercent;

    @JsonProperty(value="LowerThreshold")
    public java.lang.Double lowerThreshold;

    @JsonProperty(value="UpperThreshold")
    public java.lang.Double upperThreshold;

    @JsonProperty(value="SalarySacrifice")
    public Boolean salarySacrifice;

    @JsonProperty(value="TaxationMethod")
    public PensionTaxationMethod taxationMethod;

    @JsonProperty(value="ProRataMethod")
    public ProRataMethod proRataMethod;

    @JsonProperty(value="Pension")
    public Link pension;
}
