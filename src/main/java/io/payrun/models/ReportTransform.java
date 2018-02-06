package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ReportTransform")
public class ReportTransform
{

    @JsonProperty(value="ReportDataUri")
    public String reportDataUri;

    @JsonProperty(value="TransformDefinitionId")
    public String transformDefinitionId;


}
