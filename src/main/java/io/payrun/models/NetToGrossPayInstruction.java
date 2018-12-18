package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "NetToGrossPayInstruction")
public class NetToGrossPayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="CalculationMode")
    public NetToGrossTarget calculationMode = NetToGrossTarget.NetPay;

    @JsonProperty(value="DesiredValue")
    public java.math.BigDecimal desiredValue = new java.math.BigDecimal(0);;

    @JsonProperty(value="Units")
    public java.math.BigDecimal units;

    @JsonProperty(value="RateUoM")
    public UomBasicPay rateUoM;
}
