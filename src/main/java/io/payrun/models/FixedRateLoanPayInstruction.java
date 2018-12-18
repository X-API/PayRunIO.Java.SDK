package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "FixedRateLoanPayInstruction")
public class FixedRateLoanPayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="Identifier")
    public String identifier;

    @JsonProperty(value="RepaymentRate")
    public java.math.BigDecimal repaymentRate = new java.math.BigDecimal(0);;

    @JsonProperty(value="LoanAmount")
    public java.math.BigDecimal loanAmount;

    @JsonProperty(value="ProtectedEarnings")
    public java.math.BigDecimal protectedEarnings;
}
