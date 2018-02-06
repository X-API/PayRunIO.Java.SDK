package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RenderValue")
public class RenderValue extends SingularOutputBase
{

    @JsonProperty(value="@Output")
    public OutputType output = OutputType.Element;

    @JsonProperty(value="@Name")
    public String name;

    @JsonProperty(value="@Value")
    public String value;

    @JsonProperty(value="@Format")
    public String format;

    @JsonProperty(value="@Negate")
    public Boolean negate = false;





}
