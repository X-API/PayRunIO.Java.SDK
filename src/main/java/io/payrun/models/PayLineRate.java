package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineRate")
public class PayLineRate
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

    @JsonProperty(value="Rate")
    public java.lang.Double rate = Double.valueOf(0);;

    @JsonProperty(value="RateUoM")
    public UomBasicPay rateUoM = UomBasicPay.NotSet;

    @JsonProperty(value="Units")
    public java.lang.Double units = Double.valueOf(0);;

    @JsonProperty(value="ProRataMethodApplied")
    public ProRataMethod proRataMethodApplied = ProRataMethod.NotSet;
}
