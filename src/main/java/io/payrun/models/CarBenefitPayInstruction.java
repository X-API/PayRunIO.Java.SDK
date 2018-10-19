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
    public java.lang.Double totalCost = 0d;;

    @JsonProperty(value="EmployeeContribution")
    public java.lang.Double employeeContribution = 0d;;

    @JsonProperty(value="CashEquivalent")
    public java.lang.Double cashEquivalent;

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
    public java.lang.Double employeeContributionPrivateUse = 0d;;

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
