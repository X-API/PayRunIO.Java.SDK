package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "HolidayReclaimPayInstruction")
public class HolidayReclaimPayInstruction extends PayInstruction
{

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="UnitsDepleted")
    public java.math.BigDecimal unitsDepleted;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="LeaveStartDate")
    public java.util.Date leaveStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="LeaveEndDate")
    public java.util.Date leaveEndDate;

    @JsonProperty(value="UoM")
    public UomBasicPay uoM = UomBasicPay.NotSet;

    @JsonProperty(value="RateOverride")
    public java.math.BigDecimal rateOverride;

    @JsonProperty(value="OffsetPayment")
    public Boolean offsetPayment = false;

    @JsonProperty(value="IgnoreInsufficientHistory")
    public Boolean ignoreInsufficientHistory = false;

    @JsonProperty(value="AweExcludedPayCodes")
    public aweExcludedPayCodesWrapper aweExcludedPayCodes;

    public HolidayReclaimPayInstruction(){
        this.aweExcludedPayCodes = new aweExcludedPayCodesWrapper();
        this.aweExcludedPayCodes.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<String> getAweExcludedPayCodes() {
        return this.aweExcludedPayCodes.instance;
    }

    public class aweExcludedPayCodesWrapper { 
        @JsonProperty(value="PayCode")
        public java.util.ArrayList<String> instance;
    }
}
