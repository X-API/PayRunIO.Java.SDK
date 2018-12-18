package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineBenefit")
public class PayLineBenefit extends PayLine
{

    @JsonProperty(value="TaxableAmount")
    public java.math.BigDecimal taxableAmount = new java.math.BigDecimal(0);;

    @JsonProperty(value="AccountingMethod")
    public BenefitAccountingMethod accountingMethod = BenefitAccountingMethod.P11D;
}
