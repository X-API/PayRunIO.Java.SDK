package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "BenefitYtdPayInstruction")
public class BenefitYtdPayInstruction extends PayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="TaxableAmount")
    public java.lang.Double taxableAmount = 0d;;

    @JsonProperty(value="AccountingMethod")
    public BenefitAccountingMethod accountingMethod = BenefitAccountingMethod.P11D;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
