package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PostGraduateLoanYtdPayInstruction")
public class PostGraduateLoanYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
