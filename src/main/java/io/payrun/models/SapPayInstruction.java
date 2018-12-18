package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "SapPayInstruction")
public class SapPayInstruction extends PayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceStart")
    public java.util.Date absenceStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceEnd")
    public java.util.Date absenceEnd;

    @JsonProperty(value="StatutoryOffset")
    public Boolean statutoryOffset = false;

    @JsonProperty(value="AverageWeeklyEarningOverride")
    public java.math.BigDecimal averageWeeklyEarningOverride;

    @JsonProperty(value="PayAsLumpSum")
    public Boolean payAsLumpSum = false;

    @JsonProperty(value="PayPartWeek")
    public Boolean payPartWeek = false;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="MatchingDate")
    public java.util.Date matchingDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PlacementDate")
    public java.util.Date placementDate;

    @JsonProperty(value="KeepInTouchDays")
    public keepInTouchDaysWrapper keepInTouchDays;

    public SapPayInstruction(){
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
