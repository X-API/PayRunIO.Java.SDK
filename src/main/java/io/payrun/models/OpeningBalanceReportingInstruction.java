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
    public java.lang.Double value = 0d;;

    @JsonProperty(value="EmploymentAllowanceClaimed")
    public java.lang.Double employmentAllowanceClaimed = 0d;;

    @JsonProperty(value="Tax")
    public java.lang.Double tax = 0d;;

    @JsonProperty(value="StudentLoan")
    public java.lang.Double studentLoan = 0d;;

    @JsonProperty(value="EmployerNI")
    public java.lang.Double employerNI = 0d;;

    @JsonProperty(value="EmployeeNI")
    public java.lang.Double employeeNI = 0d;;

    @JsonProperty(value="SmpRecovered")
    public java.lang.Double smpRecovered = 0d;;

    @JsonProperty(value="SmpComp")
    public java.lang.Double smpComp = 0d;;

    @JsonProperty(value="SppRecovered")
    public java.lang.Double sppRecovered = 0d;;

    @JsonProperty(value="SppComp")
    public java.lang.Double sppComp = 0d;;

    @JsonProperty(value="ShppRecovered")
    public java.lang.Double shppRecovered = 0d;;

    @JsonProperty(value="ShppComp")
    public java.lang.Double shppComp = 0d;;

    @JsonProperty(value="SapRecovered")
    public java.lang.Double sapRecovered = 0d;;

    @JsonProperty(value="SapComp")
    public java.lang.Double sapComp = 0d;;

    @JsonProperty(value="AmountPaid")
    public java.lang.Double amountPaid = 0d;;
}
