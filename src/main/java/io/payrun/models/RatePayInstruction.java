package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RatePayInstruction")
public class RatePayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="Rate")
    public java.math.BigDecimal rate = new java.math.BigDecimal(0);;

    @JsonProperty(value="RateUoM")
    public UomBasicPay rateUoM = UomBasicPay.NotSet;

    @JsonProperty(value="Units")
    public java.math.BigDecimal units = new java.math.BigDecimal(0);;

    @JsonProperty(value="RoundingOption")
    public RoundingOption roundingOption;
}
