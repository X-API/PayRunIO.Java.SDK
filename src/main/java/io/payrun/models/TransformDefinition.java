package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "TransformDefinition")
public class TransformDefinition
{

    @JsonProperty(value="Title")
    public String title;

    @JsonProperty(value="Definition")
    public String definition;

    @JsonProperty(value="DefinitionType")
    public String definitionType;

    @JsonProperty(value="ContentType")
    public String contentType;

    @JsonProperty(value="SupportedReports")
    public String supportedReports;

    @JsonProperty(value="TaxYear")
    public java.lang.Integer taxYear;

    @JsonProperty(value="Readonly")
    public Boolean readonly = false;







}
