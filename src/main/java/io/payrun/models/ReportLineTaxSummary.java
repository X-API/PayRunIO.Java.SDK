package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ReportLineTaxSummary")
public class ReportLineTaxSummary
{

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Generated")
    public java.util.Date generated;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonProperty(value="GrossNetPay")
    public java.math.BigDecimal grossNetPay = new java.math.BigDecimal(0);

    @JsonProperty(value="GrossNiablePay")
    public java.math.BigDecimal grossNiablePay = new java.math.BigDecimal(0);

    @JsonProperty(value="GrossEmployerNI")
    public java.math.BigDecimal grossEmployerNI = new java.math.BigDecimal(0);

    @JsonProperty(value="GrossEmployeeNI")
    public java.math.BigDecimal grossEmployeeNI = new java.math.BigDecimal(0);

    @JsonProperty(value="GrossTaxablePay")
    public java.math.BigDecimal grossTaxablePay = new java.math.BigDecimal(0);

    @JsonProperty(value="GrossTax")
    public java.math.BigDecimal grossTax = new java.math.BigDecimal(0);

    @JsonProperty(value="StudentLoan")
    public java.math.BigDecimal studentLoan = new java.math.BigDecimal(0);
}
