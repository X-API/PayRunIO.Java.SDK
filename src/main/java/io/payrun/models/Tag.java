package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Tag")
public class Tag
{

    @JsonProperty(value="Text")
    public String text;

    @JsonProperty(value="Created")
    public java.util.Date created;

    @JsonProperty(value="TaggedItem")
    public Link taggedItem;



}
