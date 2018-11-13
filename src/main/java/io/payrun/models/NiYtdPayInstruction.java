package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "NiYtdPayInstruction")
public class NiYtdPayInstruction extends PayInstruction
{

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="EmployerNI")
    public java.lang.Double employerNI = 0d;;

    @JsonProperty(value="NiablePay")
    public java.lang.Double niablePay = 0d;;

    @JsonProperty(value="NiLetter")
    public String niLetter;

    @JsonProperty(value="LEL")
    public java.lang.Double lEL = 0d;;

    @JsonProperty(value="LELtoPT")
    public java.lang.Double lELtoPT = 0d;;

    @JsonProperty(value="PTtoST")
    public java.lang.Double pTtoST = 0d;;

    @JsonProperty(value="STtoUST")
    public java.lang.Double sTtoUST = 0d;;

    @JsonProperty(value="STtoAUST")
    public java.lang.Double sTtoAUST = 0d;;

    @JsonProperty(value="USTtoUEL")
    public java.lang.Double uSTtoUEL = 0d;;

    @JsonProperty(value="AboveUEL")
    public java.lang.Double aboveUEL = 0d;;

    @JsonProperty(value="DirCalculationMethod")
    public DirCalculationMethod dirCalculationMethod = DirCalculationMethod.Off;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;
}
