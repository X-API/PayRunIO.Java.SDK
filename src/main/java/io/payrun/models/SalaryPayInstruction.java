package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "SalaryPayInstruction")
public class SalaryPayInstruction extends PayInstruction
{

    @JsonProperty(value="AnnualSalary")
    public java.math.BigDecimal annualSalary = new java.math.BigDecimal(0);

    @JsonProperty(value="ProRataMethod")
    public ProRataMethod proRataMethod = ProRataMethod.NotSet;

    @JsonProperty(value="RoundingOption")
    public RoundingOption roundingOption;

    @JsonProperty(value="Code")
    public String code;
}
