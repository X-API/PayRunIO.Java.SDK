package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PrimitivePayInstruction")
public class PrimitivePayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);
}
