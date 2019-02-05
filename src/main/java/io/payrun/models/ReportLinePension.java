package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ReportLinePension")
public class ReportLinePension
{

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);

    @JsonProperty(value="Description")
    public String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonProperty(value="Generated")
    public java.util.Date generated;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonProperty(value="PensionKey")
    public String pensionKey;

    @JsonProperty(value="EmployeeContribution")
    public java.math.BigDecimal employeeContribution = new java.math.BigDecimal(0);

    @JsonProperty(value="EmployerContribution")
    public java.math.BigDecimal employerContribution = new java.math.BigDecimal(0);

    @JsonProperty(value="Payment")
    public java.math.BigDecimal payment = new java.math.BigDecimal(0);
}
