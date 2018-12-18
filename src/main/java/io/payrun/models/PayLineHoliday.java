package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineHoliday")
public class PayLineHoliday extends PayLine
{

    @JsonProperty(value="UnitsDepleted")
    public java.math.BigDecimal unitsDepleted = new java.math.BigDecimal(0);;

    @JsonProperty(value="UnitsAccrued")
    public java.math.BigDecimal unitsAccrued = new java.math.BigDecimal(0);;

    @JsonProperty(value="UoM")
    public UomBasicPay uoM = UomBasicPay.NotSet;

    @JsonProperty(value="ReclaimRate")
    public java.math.BigDecimal reclaimRate = new java.math.BigDecimal(0);;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="YearEndDate")
    public java.util.Date yearEndDate;
}
