package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RenderUniqueKeyFromLink")
public class RenderUniqueKeyFromLink extends SingularOutputBase
{

    @JsonProperty(value="@Output")
    public OutputType output = OutputType.Element;

    @JsonProperty(value="@MaxLength")
    public String maxLength;

    @JsonProperty(value="@Name")
    public String name;

    @JsonProperty(value="@Href")
    public String href;
}
