package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RenderConstant")
public class RenderConstant extends SingularOutputBase
{

    @JsonProperty(value="@Output")
    public OutputType output = OutputType.Element;

    @JsonProperty(value="@ConstantName")
    public String constantName;

    @JsonProperty(value="@ConstantType")
    public String constantType;

    @JsonProperty(value="@Name")
    public String name;




}
