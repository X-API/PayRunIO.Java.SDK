package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "SppYtdPayInstruction")
public class SppYtdPayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="Description")
    public String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceStart")
    public java.util.Date absenceStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceEnd")
    public java.util.Date absenceEnd;

    @JsonProperty(value="Value")
    public java.lang.Double value = Double.valueOf(0);;

    @JsonProperty(value="AverageWeeklyEarnings")
    public java.lang.Double averageWeeklyEarnings = Double.valueOf(0);;

    @JsonProperty(value="WeeksUsed")
    public java.lang.Double weeksUsed = Double.valueOf(0);;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
