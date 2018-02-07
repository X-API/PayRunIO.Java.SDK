package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "OpeningBalanceReportingInstruction")
public class OpeningBalanceReportingInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonProperty(value="Value")
    public java.lang.Double value = Double.valueOf(0);;

    @JsonProperty(value="EmploymentAllowanceClaimed")
    public java.lang.Double employmentAllowanceClaimed = Double.valueOf(0);;

    @JsonProperty(value="Tax")
    public java.lang.Double tax = Double.valueOf(0);;

    @JsonProperty(value="StudentLoan")
    public java.lang.Double studentLoan = Double.valueOf(0);;

    @JsonProperty(value="EmployerNI")
    public java.lang.Double employerNI = Double.valueOf(0);;

    @JsonProperty(value="EmployeeNI")
    public java.lang.Double employeeNI = Double.valueOf(0);;

    @JsonProperty(value="SmpRecovered")
    public java.lang.Double smpRecovered = Double.valueOf(0);;

    @JsonProperty(value="SmpComp")
    public java.lang.Double smpComp = Double.valueOf(0);;

    @JsonProperty(value="SppRecovered")
    public java.lang.Double sppRecovered = Double.valueOf(0);;

    @JsonProperty(value="SppComp")
    public java.lang.Double sppComp = Double.valueOf(0);;

    @JsonProperty(value="ShppRecovered")
    public java.lang.Double shppRecovered = Double.valueOf(0);;

    @JsonProperty(value="ShppComp")
    public java.lang.Double shppComp = Double.valueOf(0);;

    @JsonProperty(value="SapRecovered")
    public java.lang.Double sapRecovered = Double.valueOf(0);;

    @JsonProperty(value="SapComp")
    public java.lang.Double sapComp = Double.valueOf(0);;

    @JsonProperty(value="AmountPaid")
    public java.lang.Double amountPaid = Double.valueOf(0);;
}
