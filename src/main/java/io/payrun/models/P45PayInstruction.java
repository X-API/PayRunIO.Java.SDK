package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "P45PayInstruction")
public class P45PayInstruction extends PayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="TaxablePay")
    public java.lang.Double taxablePay = 0d;;

    @JsonProperty(value="TaxPaid")
    public java.lang.Double taxPaid = 0d;;

    @JsonProperty(value="TaxCode")
    public String taxCode;

    @JsonProperty(value="TaxBasis")
    public TaxBasis taxBasis = TaxBasis.Cumulative;

    @JsonProperty(value="StudentLoan")
    public StudentLoanCalculationMethod studentLoan = StudentLoanCalculationMethod.Off;

    @JsonProperty(value="PayFrequency")
    public PayFrequency payFrequency = PayFrequency.Weekly;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="LeavingDate")
    public java.util.Date leavingDate;

    @JsonProperty(value="PreviousEmployerPayeRef")
    public String previousEmployerPayeRef;
}
