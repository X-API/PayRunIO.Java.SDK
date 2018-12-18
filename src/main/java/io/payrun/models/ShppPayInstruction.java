package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ShppPayInstruction")
public class ShppPayInstruction extends PayInstruction
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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="BabyDueDate")
    public java.util.Date babyDueDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="BabyBornDate")
    public java.util.Date babyBornDate;

    @JsonProperty(value="SmpSapWeeksTaken")
    public java.lang.Integer smpSapWeeksTaken;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SplStartDate")
    public java.util.Date splStartDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SplEndDate")
    public java.util.Date splEndDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="MothersDateOfDeath")
    public java.util.Date mothersDateOfDeath;
}
