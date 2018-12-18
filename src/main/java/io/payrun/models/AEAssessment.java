package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "AEAssessment")
public class AEAssessment
{

    @JsonProperty(value="Age")
    public java.lang.Integer age;

    @JsonProperty(value="StatePensionAge")
    public java.lang.Integer statePensionAge;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StatePensionDate")
    public java.util.Date statePensionDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AssessmentDate")
    public java.util.Date assessmentDate;

    @JsonProperty(value="QualifyingEarnings")
    public java.math.BigDecimal qualifyingEarnings = new java.math.BigDecimal(0);;

    @JsonProperty(value="AssessmentCode")
    public AEAssessmentCode assessmentCode = AEAssessmentCode.Excluded;

    @JsonProperty(value="AssessmentEvent")
    public AEAssessmentEvent assessmentEvent = AEAssessmentEvent.NonEnrolmentEvent;

    @JsonProperty(value="AssessmentResult")
    public AEAssessmentResult assessmentResult = AEAssessmentResult.Inconclusive;

    @JsonProperty(value="AssessmentOverride")
    public AEAssessmentOverride assessmentOverride = AEAssessmentOverride.None;
}
