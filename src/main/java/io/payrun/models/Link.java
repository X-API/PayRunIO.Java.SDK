package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Link")
public class Link
{

    @JsonProperty(value="@title")
    public String title;

    @JsonProperty(value="@href")
    public String href;

    @JsonProperty(value="@rel")
    public String targetType;
}
