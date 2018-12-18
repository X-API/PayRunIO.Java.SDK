package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "HolidayYtdPayInstruction")
public class HolidayYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);;

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="UnitsAccrued")
    public java.math.BigDecimal unitsAccrued = new java.math.BigDecimal(0);;

    @JsonProperty(value="UnitsDepleted")
    public java.math.BigDecimal unitsDepleted = new java.math.BigDecimal(0);;

    @JsonProperty(value="UoM")
    public UomBasicPay uoM = UomBasicPay.NotSet;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="YearEndDate")
    public java.util.Date yearEndDate;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
