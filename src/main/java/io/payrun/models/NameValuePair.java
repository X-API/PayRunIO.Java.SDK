package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "NameValuePair")
public class NameValuePair
{

    @JsonProperty(value="@Name")
    public String name;

    @JsonProperty(value="@Value")
    public String value;
}
