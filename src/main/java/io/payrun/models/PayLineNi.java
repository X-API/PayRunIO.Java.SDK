package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineNi")
public class PayLineNi extends PayLine
{

    @JsonProperty(value="LEL")
    public java.lang.Double lEL = 0d;;

    @JsonProperty(value="LELtoPT")
    public java.lang.Double lELtoPT = 0d;;

    @JsonProperty(value="PTtoST")
    public java.lang.Double pTtoST = 0d;;

    @JsonProperty(value="STtoUAP")
    public java.lang.Double sTtoUAP = 0d;;

    @JsonProperty(value="STtoUEL")
    public java.lang.Double sTtoUEL = 0d;;

    @JsonProperty(value="UAPtoUEL")
    public java.lang.Double uAPtoUEL = 0d;;

    @JsonProperty(value="UELtoUST")
    public java.lang.Double uELtoUST = 0d;;

    @JsonProperty(value="UELtoAUST")
    public java.lang.Double uELtoAUST = 0d;;

    @JsonProperty(value="AboveUST")
    public java.lang.Double aboveUST = 0d;;

    @JsonProperty(value="AboveAUST")
    public java.lang.Double aboveAUST = 0d;;

    @JsonProperty(value="EmployerNI")
    public java.lang.Double employerNI = 0d;;

    @JsonProperty(value="DirCalculationMethod")
    public DirCalculationMethod dirCalculationMethod = DirCalculationMethod.Off;

    @JsonProperty(value="NiLetter")
    public String niLetter;

    @JsonProperty(value="NiablePay")
    public java.lang.Double niablePay = 0d;;

    @JsonProperty(value="RebateEE")
    public java.lang.Double rebateEE = 0d;;

    @JsonProperty(value="RebateER")
    public java.lang.Double rebateER = 0d;;

    @JsonProperty(value="WeeksAsDirector")
    public java.lang.Integer weeksAsDirector;
}
