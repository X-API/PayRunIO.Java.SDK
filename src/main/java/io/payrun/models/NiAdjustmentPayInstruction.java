package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "NiAdjustmentPayInstruction")
public class NiAdjustmentPayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="DirCalculationMethod")
    public DirCalculationMethod dirCalculationMethod = DirCalculationMethod.Off;

    @JsonProperty(value="NiLetter")
    public String niLetter;

    @JsonProperty(value="Periods")
    public String periods;

    @JsonProperty(value="TaxYear")
    public java.lang.Integer taxYear;

    @JsonProperty(value="Reason")
    public String reason;
}
