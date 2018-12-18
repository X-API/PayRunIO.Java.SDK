package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "HolidaySchemePayInstruction")
public class HolidaySchemePayInstruction extends PayInstruction
{

    @JsonProperty(value="AnnualEntitlementDays")
    public java.math.BigDecimal annualEntitlementDays;

    @JsonProperty(value="MaxCarryOverDays")
    public java.math.BigDecimal maxCarryOverDays;

    @JsonProperty(value="AllowNegativeBalance")
    public Boolean allowNegativeBalance;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SchemeJoinDate")
    public java.util.Date schemeJoinDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SchemeExitDate")
    public java.util.Date schemeExitDate;

    @JsonProperty(value="AccrualType")
    public HolidayAccrualType accrualType = HolidayAccrualType.DaysWorkedPerWeek;

    @JsonProperty(value="HolidayScheme")
    public Link holidayScheme;
}
