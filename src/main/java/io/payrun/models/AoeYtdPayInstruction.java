package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "AoeYtdPayInstruction")
public class AoeYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="CaseNumber")
    public String caseNumber;

    @JsonProperty(value="AoeType")
    public String aoeType;

    @JsonProperty(value="Arrears")
    public java.lang.Double arrears = 0d;;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
