package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "WhenNot")
public class WhenNot extends CompareConditionBase
{

    @JsonProperty(value="@ValueA")
    public String valueA;

    @JsonProperty(value="@ValueB")
    public String valueB;

    @JsonProperty(value="@CaseSensitive")
    public Boolean caseSensitive = false;



}
