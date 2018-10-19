package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Max")
public class Max extends AggregateOutputBase
{

    @JsonProperty(value="@Output")
    public OutputType output = OutputType.Element;

    @JsonProperty(value="@MaxLength")
    public String maxLength;

    @JsonProperty(value="@Name")
    public String name;

    @JsonProperty(value="@Property")
    public String property;

    @JsonProperty(value="@Negate")
    public Boolean negate = false;

    @JsonProperty(value="@Format")
    public String format;

    @JsonProperty(value="Filter")
    public java.util.ArrayList<FilterBase> filters;
}
