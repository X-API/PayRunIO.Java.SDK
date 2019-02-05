package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ReportLineStatutoryRecovery")
public class ReportLineStatutoryRecovery
{

    @JsonProperty(value="Value")
    public java.math.BigDecimal value = new java.math.BigDecimal(0);

    @JsonProperty(value="Description")
    public String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonProperty(value="Generated")
    public java.util.Date generated;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonProperty(value="SmallEmployerRelief")
    public Boolean smallEmployerRelief = false;

    @JsonProperty(value="AbsenceReportCode")
    public String absenceReportCode;

    @JsonProperty(value="StatutoryTotal")
    public java.math.BigDecimal statutoryTotal = new java.math.BigDecimal(0);

    @JsonProperty(value="Compensation")
    public java.math.BigDecimal compensation = new java.math.BigDecimal(0);
}
