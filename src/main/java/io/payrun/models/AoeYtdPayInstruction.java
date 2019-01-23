package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "AoeYtdPayInstruction")
public class AoeYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);

    @JsonProperty(value="CaseNumber")
    public String caseNumber;

    @JsonProperty(value="AoeType")
    public String aoeType;

    @JsonProperty(value="Arrears")
    public java.math.BigDecimal arrears = new java.math.BigDecimal(0);

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
