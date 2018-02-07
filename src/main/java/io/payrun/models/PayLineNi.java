package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineNi")
public class PayLineNi
{

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Calculator")
    public String calculator;

    @JsonProperty(value="Generated")
    public java.util.Date generated;

    @JsonProperty(value="PayCode")
    public String payCode;

    @JsonProperty(value="PayCodeType")
    public SystemCodeType payCodeType = SystemCodeType.NotSet;

    @JsonProperty(value="Value")
    public java.lang.Double value = Double.valueOf(0);;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PaymentDate")
    public java.util.Date paymentDate;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxPeriod")
    public java.lang.Short taxPeriod;

    @JsonProperty(value="LEL")
    public java.lang.Double lEL = Double.valueOf(0);;

    @JsonProperty(value="LELtoPT")
    public java.lang.Double lELtoPT = Double.valueOf(0);;

    @JsonProperty(value="PTtoST")
    public java.lang.Double pTtoST = Double.valueOf(0);;

    @JsonProperty(value="STtoUAP")
    public java.lang.Double sTtoUAP = Double.valueOf(0);;

    @JsonProperty(value="STtoUEL")
    public java.lang.Double sTtoUEL = Double.valueOf(0);;

    @JsonProperty(value="UAPtoUEL")
    public java.lang.Double uAPtoUEL = Double.valueOf(0);;

    @JsonProperty(value="UELtoUST")
    public java.lang.Double uELtoUST = Double.valueOf(0);;

    @JsonProperty(value="UELtoAUST")
    public java.lang.Double uELtoAUST = Double.valueOf(0);;

    @JsonProperty(value="AboveUST")
    public java.lang.Double aboveUST = Double.valueOf(0);;

    @JsonProperty(value="AboveAUST")
    public java.lang.Double aboveAUST = Double.valueOf(0);;

    @JsonProperty(value="EmployerNI")
    public java.lang.Double employerNI = Double.valueOf(0);;

    @JsonProperty(value="DirCalculationMethod")
    public DirCalculationMethod dirCalculationMethod = DirCalculationMethod.Off;

    @JsonProperty(value="NiLetter")
    public String niLetter;

    @JsonProperty(value="NiablePay")
    public java.lang.Double niablePay = Double.valueOf(0);;

    @JsonProperty(value="RebateEE")
    public java.lang.Double rebateEE = Double.valueOf(0);;

    @JsonProperty(value="RebateER")
    public java.lang.Double rebateER = Double.valueOf(0);;

    @JsonProperty(value="WeeksAsDirector")
    public java.lang.Integer weeksAsDirector;
}
