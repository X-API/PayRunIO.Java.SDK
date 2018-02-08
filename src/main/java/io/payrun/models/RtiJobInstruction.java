package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RtiJobInstruction")
public class RtiJobInstruction
{

    @JsonProperty(value="HoldingDate")
    public java.util.Date holdingDate;

    @JsonProperty(value="RtiType")
    public String rtiType;

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

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="NoPaymentForPeriodFrom")
    public java.util.Date noPaymentForPeriodFrom;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="NoPaymentForPeriodTo")
    public java.util.Date noPaymentForPeriodTo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PeriodOfInactivityFrom")
    public java.util.Date periodOfInactivityFrom;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PeriodOfInactivityTo")
    public java.util.Date periodOfInactivityTo;

    @JsonProperty(value="EarlierTaxYear")
    public java.lang.Integer earlierTaxYear;
}
