package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "SapYtdPayInstruction")
public class SapYtdPayInstruction extends PayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceStart")
    public java.util.Date absenceStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceEnd")
    public java.util.Date absenceEnd;

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);;

    @JsonProperty(value="AverageWeeklyEarnings")
    public java.math.BigDecimal averageWeeklyEarnings = new java.math.BigDecimal(0);;

    @JsonProperty(value="WeeksUsed")
    public java.math.BigDecimal weeksUsed = new java.math.BigDecimal(0);;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;

    @JsonProperty(value="KeepInTouchDays")
    public keepInTouchDaysWrapper keepInTouchDays;

    public SapYtdPayInstruction(){
        this.keepInTouchDays = new keepInTouchDaysWrapper();
        this.keepInTouchDays.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<java.util.Date> getKeepInTouchDays() {
        return this.keepInTouchDays.instance;
    }

    public class keepInTouchDaysWrapper { 
        @JsonProperty(value="Date")
        public java.util.ArrayList<java.util.Date> instance;
    }
}
