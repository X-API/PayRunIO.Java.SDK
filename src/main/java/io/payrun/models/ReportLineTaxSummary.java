package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ReportLineTaxSummary")
public class ReportLineTaxSummary
{

    @JsonProperty(value="Value")
    public java.lang.Double value = Double.valueOf(0);;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Generated")
    public java.util.Date generated;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonProperty(value="GrossNetPay")
    public java.lang.Double grossNetPay = Double.valueOf(0);;

    @JsonProperty(value="GrossNiablePay")
    public java.lang.Double grossNiablePay = Double.valueOf(0);;

    @JsonProperty(value="GrossEmployerNI")
    public java.lang.Double grossEmployerNI = Double.valueOf(0);;

    @JsonProperty(value="GrossEmployeeNI")
    public java.lang.Double grossEmployeeNI = Double.valueOf(0);;

    @JsonProperty(value="GrossTaxablePay")
    public java.lang.Double grossTaxablePay = Double.valueOf(0);;

    @JsonProperty(value="GrossTax")
    public java.lang.Double grossTax = Double.valueOf(0);;

    @JsonProperty(value="StudentLoan")
    public java.lang.Double studentLoan = Double.valueOf(0);;
}
