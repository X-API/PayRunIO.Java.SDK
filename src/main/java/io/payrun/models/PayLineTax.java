package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineTax")
public class PayLineTax extends PayLine
{

    @JsonProperty(value="TaxBasis")
    public TaxBasis taxBasis = TaxBasis.Cumulative;

    @JsonProperty(value="TaxCode")
    public String taxCode;

    @JsonProperty(value="TaxablePay")
    public java.math.BigDecimal taxablePay = new java.math.BigDecimal(0);
}
