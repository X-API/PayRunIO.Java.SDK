package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "NiAdjustmentPayInstruction")
public class NiAdjustmentPayInstruction extends PayInstruction
{

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
