package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "FixedRateLoanYtdPayInstruction")
public class FixedRateLoanYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="Identifier")
    public String identifier;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
