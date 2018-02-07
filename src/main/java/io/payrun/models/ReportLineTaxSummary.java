package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ReportLineTaxSummary")
public class ReportLineTaxSummary
{

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Generated")
    public java.util.Date generated;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonProperty(value="GrossNetPay")
    public java.lang.Double grossNetPay = 0d;;

    @JsonProperty(value="GrossNiablePay")
    public java.lang.Double grossNiablePay = 0d;;

    @JsonProperty(value="GrossEmployerNI")
    public java.lang.Double grossEmployerNI = 0d;;

    @JsonProperty(value="GrossEmployeeNI")
    public java.lang.Double grossEmployeeNI = 0d;;

    @JsonProperty(value="GrossTaxablePay")
    public java.lang.Double grossTaxablePay = 0d;;

    @JsonProperty(value="GrossTax")
    public java.lang.Double grossTax = 0d;;

    @JsonProperty(value="StudentLoan")
    public java.lang.Double studentLoan = 0d;;
}
