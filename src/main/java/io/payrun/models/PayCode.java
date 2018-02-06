package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayCode")
public class PayCode
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EffectiveDate")
    public java.util.Date effectiveDate;

    @JsonProperty(value="Revision")
    public java.lang.Integer revision;

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Niable")
    public Boolean niable = false;

    @JsonProperty(value="Taxable")
    public Boolean taxable = false;

    @JsonProperty(value="Territory")
    public CalculatorTerritory territory = CalculatorTerritory.NotSet;

    @JsonProperty(value="Region")
    public CalculatorRegion region = CalculatorRegion.NotSet;

    @JsonProperty(value="Type")
    public SystemCodeType type = SystemCodeType.NotSet;

    @JsonProperty(value="Benefit")
    public Boolean benefit = false;

    @JsonProperty(value="Readonly")
    public Boolean readonly = false;

    @JsonProperty(value="NominalCode")
    public Link nominalCode;












}
