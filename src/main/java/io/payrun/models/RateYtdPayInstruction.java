package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RateYtdPayInstruction")
public class RateYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="Rate")
    public java.lang.Double rate = 0d;;

    @JsonProperty(value="RateUoM")
    public UomBasicPay rateUoM = UomBasicPay.NotSet;

    @JsonProperty(value="Units")
    public java.lang.Double units = 0d;;

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
