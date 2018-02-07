package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RenderProperty")
public class RenderProperty extends SingularOutputBase
{

    @JsonProperty(value="@Output")
    public OutputType output = OutputType.Element;

    @JsonProperty(value="@Name")
    public String name;

    @JsonProperty(value="@Property")
    public String property;

    @JsonProperty(value="@Format")
    public String format;
}
