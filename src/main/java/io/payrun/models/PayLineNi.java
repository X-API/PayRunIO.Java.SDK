package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineNi")
public class PayLineNi extends PayLine
{

    @JsonProperty(value="LEL")
    public java.math.BigDecimal lEL = new java.math.BigDecimal(0);;

    @JsonProperty(value="LELtoPT")
    public java.math.BigDecimal lELtoPT = new java.math.BigDecimal(0);;

    @JsonProperty(value="PTtoST")
    public java.math.BigDecimal pTtoST = new java.math.BigDecimal(0);;

    @JsonProperty(value="STtoUST")
    public java.math.BigDecimal sTtoUST = new java.math.BigDecimal(0);;

    @JsonProperty(value="STtoAUST")
    public java.math.BigDecimal sTtoAUST = new java.math.BigDecimal(0);;

    @JsonProperty(value="USTtoUEL")
    public java.math.BigDecimal uSTtoUEL = new java.math.BigDecimal(0);;

    @JsonProperty(value="AboveUEL")
    public java.math.BigDecimal aboveUEL = new java.math.BigDecimal(0);;

    @JsonProperty(value="EmployerNI")
    public java.math.BigDecimal employerNI = new java.math.BigDecimal(0);;

    @JsonProperty(value="DirCalculationMethod")
    public DirCalculationMethod dirCalculationMethod = DirCalculationMethod.Off;

    @JsonProperty(value="NiLetter")
    public String niLetter;

    @JsonProperty(value="NiablePay")
    public java.math.BigDecimal niablePay = new java.math.BigDecimal(0);;

    @JsonProperty(value="WeeksAsDirector")
    public java.lang.Integer weeksAsDirector;
}
