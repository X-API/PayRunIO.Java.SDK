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
    public java.lang.Double units;

    @JsonProperty(value="UnitRate")
    public java.lang.Double unitRate;

    @JsonProperty(value="VAT")
    public java.lang.Double vAT;

    @JsonProperty(value="GrossPay")
    public java.lang.Double grossPay = 0d;;

    @JsonProperty(value="CisDeduction")
    public java.lang.Double cisDeduction = 0d;;

    @JsonProperty(value="Description")
    public String description;
}
