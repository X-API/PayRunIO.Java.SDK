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
    public java.lang.Double value = 0d;;

    @JsonProperty(value="TaxableAmount")
    public java.lang.Double taxableAmount = 0d;;

    @JsonProperty(value="AccountingMethod")
    public BenefitAccountingMethod accountingMethod = BenefitAccountingMethod.P11D;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;

    @JsonProperty(value="TaxableVehicle")
    public java.lang.Double taxableVehicle = 0d;;

    @JsonProperty(value="TaxableFuel")
    public java.lang.Double taxableFuel = 0d;;

    @JsonProperty(value="VehicleRegistration")
    public String vehicleRegistration;
}
