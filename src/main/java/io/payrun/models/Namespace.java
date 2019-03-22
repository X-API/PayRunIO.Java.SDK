package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Namespace")
public class Namespace
{

    @JsonProperty(value="@Prefix")
    public String prefix;

    @JsonProperty(value="#text")
    public String href;
}
