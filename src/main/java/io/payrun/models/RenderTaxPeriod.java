package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RenderTaxPeriod")
public class RenderTaxPeriod extends SingularOutputBase
{

    @JsonProperty(value="@Output")
    public OutputType output = OutputType.Element;

    @JsonProperty(value="@DisplayName")
    public String displayName;

    @JsonProperty(value="@PayFrequency")
    public String payFrequency;

    @JsonProperty(value="@Date")
    public String date;

    @JsonProperty(value="@RenderOption")
    public RenderTaxPeriodOption renderOption = RenderTaxPeriodOption.AsString;





}
