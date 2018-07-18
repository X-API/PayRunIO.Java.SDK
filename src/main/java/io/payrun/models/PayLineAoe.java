package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineAoe")
public class PayLineAoe extends PayLine
{

    @JsonProperty(value="CaseNumber")
    public String caseNumber;

    @JsonProperty(value="Arrears")
    public java.lang.Double arrears = 0d;;
}
