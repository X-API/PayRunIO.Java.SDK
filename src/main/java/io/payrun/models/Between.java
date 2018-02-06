package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Between")
public class Between extends FilterBase
{

    @JsonProperty(value="@Property")
    public String property;

    @JsonProperty(value="@Value")
    public String value;

    @JsonProperty(value="@Value2")
    public String value2;



}
