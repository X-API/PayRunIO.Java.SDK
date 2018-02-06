package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Ascending")
public class Ascending extends OrderByBase
{

    @JsonProperty(value="@Property")
    public String property;

}
