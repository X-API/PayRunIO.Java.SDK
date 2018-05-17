package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "SppYtdPayInstruction")
public class SppYtdPayInstruction extends PayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceStart")
    public java.util.Date absenceStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceEnd")
    public java.util.Date absenceEnd;

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="AverageWeeklyEarnings")
    public java.lang.Double averageWeeklyEarnings = 0d;;

    @JsonProperty(value="WeeksUsed")
    public java.lang.Double weeksUsed = 0d;;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
