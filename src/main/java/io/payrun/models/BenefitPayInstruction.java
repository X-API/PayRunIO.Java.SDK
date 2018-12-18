package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "BenefitPayInstruction")
public class BenefitPayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="TotalCost")
    public java.math.BigDecimal totalCost = new java.math.BigDecimal(0);;

    @JsonProperty(value="EmployeeContribution")
    public java.math.BigDecimal employeeContribution = new java.math.BigDecimal(0);;

    @JsonProperty(value="CashEquivalent")
    public java.math.BigDecimal cashEquivalent;

    @JsonProperty(value="AccountingMethod")
    public BenefitAccountingMethod accountingMethod = BenefitAccountingMethod.P11D;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="BenefitEndDate")
    public java.util.Date benefitEndDate;
}
