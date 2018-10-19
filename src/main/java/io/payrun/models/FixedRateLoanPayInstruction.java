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
    public java.lang.Double repaymentRate = 0d;;

    @JsonProperty(value="LoanAmount")
    public java.lang.Double loanAmount;

    @JsonProperty(value="ProtectedEarnings")
    public java.lang.Double protectedEarnings;
}
