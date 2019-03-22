package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "MetaData")
public class MetaData
{

    @JsonProperty(value="Item")
    public java.util.ArrayList<MetaDataItem> items;
}
