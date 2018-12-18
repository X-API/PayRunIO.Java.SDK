package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PensionYtdPayInstruction")
public class PensionYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="PensionablePay")
    public java.math.BigDecimal pensionablePay = new java.math.BigDecimal(0);;

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);;

    @JsonProperty(value="EmployerContribution")
    public java.math.BigDecimal employerContribution = new java.math.BigDecimal(0);;

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;

    @JsonProperty(value="Pension")
    public Link pension;
}
