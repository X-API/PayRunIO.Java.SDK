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
    public java.lang.Double totalCost = 0d;;

    @JsonProperty(value="EmployeeContribution")
    public java.lang.Double employeeContribution = 0d;;

    @JsonProperty(value="CashEquivalent")
    public java.lang.Double cashEquivalent = 0d;;

    @JsonProperty(value="AccountingMethod")
    public BenefitAccountingMethod accountingMethod = BenefitAccountingMethod.P11D;
}
