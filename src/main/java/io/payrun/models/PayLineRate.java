package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineRate")
public class PayLineRate extends PayLine
{

    @JsonProperty(value="Rate")
    public java.math.BigDecimal rate = new java.math.BigDecimal(0);;

    @JsonProperty(value="RateUoM")
    public UomBasicPay rateUoM = UomBasicPay.NotSet;

    @JsonProperty(value="Units")
    public java.math.BigDecimal units = new java.math.BigDecimal(0);;

    @JsonProperty(value="ProRataMethodApplied")
    public ProRataMethod proRataMethodApplied = ProRataMethod.NotSet;
}
