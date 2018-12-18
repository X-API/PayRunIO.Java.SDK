package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "HolidayScheme")
public class HolidayScheme
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EffectiveDate")
    public java.util.Date effectiveDate;

    @JsonProperty(value="Revision")
    public java.lang.Integer revision;

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="SchemeKey")
    public String schemeKey;

    @JsonProperty(value="SchemeName")
    public String schemeName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SchemeCeasedDate")
    public java.util.Date schemeCeasedDate;

    @JsonProperty(value="YearStartMonth")
    public java.lang.Short yearStartMonth;

    @JsonProperty(value="YearStartDay")
    public java.lang.Short yearStartDay;

    @JsonProperty(value="AnnualEntitlementWeeks")
    public java.math.BigDecimal annualEntitlementWeeks = new java.math.BigDecimal(0);;

    @JsonProperty(value="MaxCarryOverDays")
    public java.math.BigDecimal maxCarryOverDays = new java.math.BigDecimal(0);;

    @JsonProperty(value="AllowNegativeBalance")
    public Boolean allowNegativeBalance = false;

    @JsonProperty(value="BankHolidayInclusive")
    public Boolean bankHolidayInclusive = false;

    @JsonProperty(value="AccrualPayCodes")
    public accrualPayCodesWrapper accrualPayCodes;

    public HolidayScheme(){
        this.accrualPayCodes = new accrualPayCodesWrapper();
        this.accrualPayCodes.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<String> getAccrualPayCodes() {
        return this.accrualPayCodes.instance;
    }

    public class accrualPayCodesWrapper { 
        @JsonProperty(value="PayCode")
        public java.util.ArrayList<String> instance;
    }
}
