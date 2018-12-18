package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "TaxYtdPayInstruction")
public class TaxYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);;

    @JsonProperty(value="TaxablePay")
    public java.math.BigDecimal taxablePay = new java.math.BigDecimal(0);;

    @JsonProperty(value="TaxCode")
    public String taxCode;

    @JsonProperty(value="TaxBasis")
    public TaxBasis taxBasis = TaxBasis.Cumulative;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
