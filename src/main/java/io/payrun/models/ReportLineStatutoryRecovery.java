package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ReportLineStatutoryRecovery")
public class ReportLineStatutoryRecovery
{

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="Description")
    public String description;

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
    public java.lang.Double statutoryTotal = 0d;;

    @JsonProperty(value="Compensation")
    public java.lang.Double compensation = 0d;;
}
