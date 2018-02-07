package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ApplicationInfo")
public class ApplicationInfo
{

    @JsonProperty(value="ApplicationName")
    public String applicationName;

    @JsonProperty(value="UniqueKey")
    public String uniqueKey;

    @JsonProperty(value="ConsumerKey")
    public String consumerKey;

    @JsonProperty(value="ConsumerSecret")
    public String consumerSecret;
}
