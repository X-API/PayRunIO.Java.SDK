package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Commentary")
public class Commentary
{

    @JsonProperty(value="Created")
    public java.util.Date created;

    @JsonProperty(value="Detail")
    public String detail;


}
