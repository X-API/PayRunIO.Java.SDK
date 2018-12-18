package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "CisLine")
public class CisLine
{

    @JsonProperty(value="Generated")
    public java.util.Date generated;

    @JsonProperty(value="NominalCodeKey")
    public String nominalCodeKey;

    @JsonProperty(value="TaxTreatment")
    public CisTaxTreatment taxTreatment = CisTaxTreatment.Taxable;

    @JsonProperty(value="CisLineType")
    public String cisLineType;

    @JsonProperty(value="PayFrequency")
    public SubContractorPayFrequency payFrequency = SubContractorPayFrequency.Monthly;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxPeriod")
    public java.lang.Short taxPeriod;

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonProperty(value="UOM")
    public UomBasicPay uOM;

    @JsonProperty(value="Units")
    public java.math.BigDecimal units;

    @JsonProperty(value="UnitRate")
    public java.math.BigDecimal unitRate;

    @JsonProperty(value="VAT")
    public java.math.BigDecimal vAT;

    @JsonProperty(value="GrossPay")
    public java.math.BigDecimal grossPay = new java.math.BigDecimal(0);;

    @JsonProperty(value="CisDeduction")
    public java.math.BigDecimal cisDeduction = new java.math.BigDecimal(0);;

    @JsonProperty(value="Description")
    public String description;
}
