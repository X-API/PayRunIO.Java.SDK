package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RtiFpsJobInstruction")
public class RtiFpsJobInstruction
{

    @JsonProperty(value="HoldingDate")
    public java.util.Date holdingDate;

    @JsonProperty(value="Generate")
    public Boolean generate = false;

    @JsonProperty(value="Transmit")
    public Boolean transmit = false;

    @JsonProperty(value="TaxYear")
    public java.lang.Integer taxYear;

    @JsonProperty(value="Employer")
    public Link employer;

    @JsonProperty(value="Timestamp")
    public java.util.Date timestamp;

    @JsonProperty(value="PaySchedule")
    public Link paySchedule;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PaymentDate")
    public java.util.Date paymentDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SchemeCeased")
    public java.util.Date schemeCeased;

    @JsonProperty(value="FinalSubmissionForYear")
    public Boolean finalSubmissionForYear;

    @JsonProperty(value="LateReason")
    public FpsLateReason lateReason;
}
