package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "CarBenefitYtdPayInstruction")
public class CarBenefitYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);;

    @JsonProperty(value="TaxableAmount")
    public java.math.BigDecimal taxableAmount = new java.math.BigDecimal(0);;

    @JsonProperty(value="AccountingMethod")
    public BenefitAccountingMethod accountingMethod = BenefitAccountingMethod.P11D;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;

    @JsonProperty(value="TaxableVehicle")
    public java.math.BigDecimal taxableVehicle = new java.math.BigDecimal(0);;

    @JsonProperty(value="TaxableFuel")
    public java.math.BigDecimal taxableFuel = new java.math.BigDecimal(0);;

    @JsonProperty(value="VehicleRegistration")
    public String vehicleRegistration;
}
