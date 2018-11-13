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
    public java.lang.Double rate = 0d;;

    @JsonProperty(value="RateUoM")
    public UomBasicPay rateUoM = UomBasicPay.NotSet;

    @JsonProperty(value="Units")
    public java.lang.Double units = 0d;;

    @JsonProperty(value="RoundingOption")
    public RoundingOption roundingOption;
}
