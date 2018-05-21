package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "StudentLoanYtdPayInstruction")
public class StudentLoanYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="StudentLoanCalculationMethod")
    public StudentLoanCalculationMethod studentLoanCalculationMethod = StudentLoanCalculationMethod.Off;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
