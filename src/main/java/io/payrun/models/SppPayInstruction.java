package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "SppPayInstruction")
public class SppPayInstruction
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

    @JsonProperty(value="StatutoryOffset")
    public Boolean statutoryOffset = false;

    @JsonProperty(value="AverageWeeklyEarningOverride")
    public java.lang.Double averageWeeklyEarningOverride;

    @JsonProperty(value="PayPartWeek")
    public Boolean payPartWeek = false;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="BabyDueDate")
    public java.util.Date babyDueDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="BabyBornDate")
    public java.util.Date babyBornDate;

    @JsonProperty(value="Stillbirth")
    public Boolean stillbirth = false;

    @JsonProperty(value="WorkingDays")
    public workingDaysWrapper workingDays;

    public SppPayInstruction(){
        this.workingDays = new workingDaysWrapper();
        this.workingDays.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<java.util.Date> getWorkingDays() {
        return this.workingDays.instance;
    }

    public class workingDaysWrapper { 
        @JsonProperty(value="Date")
        public java.util.ArrayList<java.util.Date> instance;
    }
}
