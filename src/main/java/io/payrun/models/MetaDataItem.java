package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "MetaDataItem")
public class MetaDataItem
{

    @JsonProperty(value="@Name")
    public String name;

    @JsonProperty(value="#text")
    public String value;
}
