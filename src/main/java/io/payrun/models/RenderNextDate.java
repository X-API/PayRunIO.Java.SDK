package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RenderNextDate")
public class RenderNextDate extends SingularOutputBase
{

    @JsonProperty(value="@Output")
    public OutputType output = OutputType.Element;

    @JsonProperty(value="@MaxLength")
    public String maxLength;

    @JsonProperty(value="@Name")
    public String name;

    @JsonProperty(value="@Date")
    public String date;

    @JsonProperty(value="@PayFrequency")
    public String payFrequency;

    @JsonProperty(value="@Format")
    public String format;
}
