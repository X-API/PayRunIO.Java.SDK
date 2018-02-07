package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "HealthCheck")
public class HealthCheck
{

    @JsonProperty(value="Version")
    public String version;

    @JsonProperty(value="Info")
    public String info;
}
