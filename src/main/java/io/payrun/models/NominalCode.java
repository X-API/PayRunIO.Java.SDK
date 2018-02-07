package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "NominalCode")
public class NominalCode
{

    @JsonProperty(value="Key")
    public String key;

    @JsonProperty(value="Description")
    public String description;
}
