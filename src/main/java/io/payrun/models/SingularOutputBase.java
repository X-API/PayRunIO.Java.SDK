package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "SingularOutputBase")
public abstract class SingularOutputBase
{

    @JsonProperty(value="@Output")
    public OutputType output = OutputType.Element;
}
