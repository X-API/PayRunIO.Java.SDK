package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineSpp")
public class PayLineSpp
{

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Calculator")
    public String calculator;

    @JsonProperty(value="Generated")
    public java.util.Date generated;

    @JsonProperty(value="PayCode")
    public String payCode;

    @JsonProperty(value="PayCodeType")
    public SystemCodeType payCodeType = SystemCodeType.NotSet;

    @JsonProperty(value="Value")
    public java.lang.Double value = Double.valueOf(0);;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PaymentDate")
    public java.util.Date paymentDate;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxPeriod")
    public java.lang.Short taxPeriod;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceStart")
    public java.util.Date absenceStart;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="AbsenceEnd")
    public java.util.Date absenceEnd;

    @JsonProperty(value="AverageWeeklyEarnings")
    public java.lang.Double averageWeeklyEarnings = Double.valueOf(0);;

    @JsonProperty(value="WeeksUsed")
    public java.lang.Double weeksUsed = Double.valueOf(0);;

    @JsonProperty(value="ExclusionReason")
    public SppExclusionReason exclusionReason = SppExclusionReason.None;
}
