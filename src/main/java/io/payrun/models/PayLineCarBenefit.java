package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineCarBenefit")
public class PayLineCarBenefit extends PayLine
{

    @JsonProperty(value="TaxableAmount")
    public java.math.BigDecimal taxableAmount = new java.math.BigDecimal(0);

    @JsonProperty(value="AccountingMethod")
    public BenefitAccountingMethod accountingMethod = BenefitAccountingMethod.P11D;

    @JsonProperty(value="TaxableVehicle")
    public java.math.BigDecimal taxableVehicle = new java.math.BigDecimal(0);

    @JsonProperty(value="TaxableFuel")
    public java.math.BigDecimal taxableFuel = new java.math.BigDecimal(0);

    @JsonProperty(value="VehicleRegistration")
    public String vehicleRegistration;

    @JsonProperty(value="CashEquivalentVehicle")
    public java.math.BigDecimal cashEquivalentVehicle = new java.math.BigDecimal(0);

    @JsonProperty(value="CashEquivalentFuel")
    public java.math.BigDecimal cashEquivalentFuel = new java.math.BigDecimal(0);
}
