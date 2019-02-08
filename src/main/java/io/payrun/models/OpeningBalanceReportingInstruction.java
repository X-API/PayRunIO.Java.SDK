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
    public java.math.BigDecimal value = new java.math.BigDecimal(0);

    @JsonProperty(value="EmploymentAllowanceClaimed")
    public java.math.BigDecimal employmentAllowanceClaimed = new java.math.BigDecimal(0);

    @JsonProperty(value="Tax")
    public java.math.BigDecimal tax = new java.math.BigDecimal(0);

    @JsonProperty(value="StudentLoan")
    public java.math.BigDecimal studentLoan = new java.math.BigDecimal(0);

    @JsonProperty(value="PostGraduateLoan")
    public java.math.BigDecimal postGraduateLoan = new java.math.BigDecimal(0);

    @JsonProperty(value="EmployerNI")
    public java.math.BigDecimal employerNI = new java.math.BigDecimal(0);

    @JsonProperty(value="EmployeeNI")
    public java.math.BigDecimal employeeNI = new java.math.BigDecimal(0);

    @JsonProperty(value="SmpRecovered")
    public java.math.BigDecimal smpRecovered = new java.math.BigDecimal(0);

    @JsonProperty(value="SmpComp")
    public java.math.BigDecimal smpComp = new java.math.BigDecimal(0);

    @JsonProperty(value="SppRecovered")
    public java.math.BigDecimal sppRecovered = new java.math.BigDecimal(0);

    @JsonProperty(value="SppComp")
    public java.math.BigDecimal sppComp = new java.math.BigDecimal(0);

    @JsonProperty(value="ShppRecovered")
    public java.math.BigDecimal shppRecovered = new java.math.BigDecimal(0);

    @JsonProperty(value="ShppComp")
    public java.math.BigDecimal shppComp = new java.math.BigDecimal(0);

    @JsonProperty(value="SapRecovered")
    public java.math.BigDecimal sapRecovered = new java.math.BigDecimal(0);

    @JsonProperty(value="SapComp")
    public java.math.BigDecimal sapComp = new java.math.BigDecimal(0);

    @JsonProperty(value="AmountPaid")
    public java.math.BigDecimal amountPaid = new java.math.BigDecimal(0);
}
