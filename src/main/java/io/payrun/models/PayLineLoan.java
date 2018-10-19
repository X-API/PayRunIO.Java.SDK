package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineLoan")
public class PayLineLoan extends PayLine
{

    @JsonProperty(value="Identifier")
    public String identifier;
}
