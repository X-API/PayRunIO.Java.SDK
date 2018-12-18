package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "CarBenefitPayInstruction")
public class CarBenefitPayInstruction extends PayInstruction
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

    @JsonProperty(value="MakeModel")
    public String makeModel;

    @JsonProperty(value="Co2")
    public java.lang.Integer co2;

    @JsonProperty(value="FuelType")
    public FuelType fuelType = FuelType.NotSet;

    @JsonProperty(value="Registration")
    public String registration;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="DateRegistered")
    public java.util.Date dateRegistered;

    @JsonProperty(value="EmployeeContributionPrivateUse")
    public java.math.BigDecimal employeeContributionPrivateUse = new java.math.BigDecimal(0);;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="FuelProvidedFrom")
    public java.util.Date fuelProvidedFrom;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="FuelWithdrawn")
    public java.util.Date fuelWithdrawn;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="FuelReinstated")
    public java.util.Date fuelReinstated;
}
