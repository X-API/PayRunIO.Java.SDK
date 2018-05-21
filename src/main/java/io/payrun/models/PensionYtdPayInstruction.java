package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PensionYtdPayInstruction")
public class PensionYtdPayInstruction extends PayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="PensionablePay")
    public java.lang.Double pensionablePay = 0d;;

    @JsonProperty(value="Value")
    public java.lang.Double value = 0d;;

    @JsonProperty(value="EmployerContribution")
    public java.lang.Double employerContribution = 0d;;

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="IsAdjustment")
    public Boolean isAdjustment = false;

    @JsonProperty(value="Pension")
    public Link pension;
}
