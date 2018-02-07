package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayRun")
public class PayRun
{

    @JsonProperty(value="PayFrequency")
    public PayFrequency payFrequency = PayFrequency.Weekly;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PaymentDate")
    public java.util.Date paymentDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PeriodStart")
    public java.util.Date periodStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PeriodEnd")
    public java.util.Date periodEnd;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxPeriod")
    public java.lang.Short taxPeriod;

    @JsonProperty(value="IsSupplementary")
    public Boolean isSupplementary = false;

    @JsonProperty(value="PaySchedule")
    public Link paySchedule;

    @JsonProperty(value="ProceedingPayRun")
    public Link proceedingPayRun;

    @JsonProperty(value="Sequence")
    public java.lang.Integer sequence;
}
