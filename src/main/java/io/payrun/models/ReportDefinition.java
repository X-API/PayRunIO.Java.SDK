package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ReportDefinition")
public class ReportDefinition
{

    @JsonProperty(value="Title")
    public String title;

    @JsonProperty(value="Readonly")
    public Boolean readonly = false;

    @JsonProperty(value="ReportQuery")
    public Query reportQuery;
}
