package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineStudentLoan")
public class PayLineStudentLoan extends PayLine
{

    @JsonProperty(value="StudentLoanCalculationMethod")
    public StudentLoanCalculationMethod studentLoanCalculationMethod = StudentLoanCalculationMethod.Off;
}
