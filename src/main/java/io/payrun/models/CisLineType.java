package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "CisLineType")
public class CisLineType
{

    @JsonProperty(value="LineType")
    public String lineType;

    @JsonProperty(value="TaxTreatment")
    public CisTaxTreatment taxTreatment = CisTaxTreatment.Taxable;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="NominalCode")
    public Link nominalCode;
}
