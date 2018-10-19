package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineCarBenefit")
public class PayLineCarBenefit extends PayLine
{

    @JsonProperty(value="TaxableAmount")
    public java.lang.Double taxableAmount = 0d;;

    @JsonProperty(value="AccountingMethod")
    public BenefitAccountingMethod accountingMethod = BenefitAccountingMethod.P11D;

    @JsonProperty(value="TaxableVehicle")
    public java.lang.Double taxableVehicle = 0d;;

    @JsonProperty(value="TaxableFuel")
    public java.lang.Double taxableFuel = 0d;;

    @JsonProperty(value="VehicleRegistration")
    public String vehicleRegistration;

    @JsonProperty(value="CashEquivalentVehicle")
    public java.lang.Double cashEquivalentVehicle = 0d;;

    @JsonProperty(value="CashEquivalentFuel")
    public java.lang.Double cashEquivalentFuel = 0d;;
}
