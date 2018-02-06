package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RenderTaxPeriodDate")
public class RenderTaxPeriodDate extends SingularOutputBase
{

    @JsonProperty(value="@Output")
    public OutputType output = OutputType.Element;

    @JsonProperty(value="@DisplayName")
    public String displayName;

    @JsonProperty(value="@TaxYear")
    public String taxYear;

    @JsonProperty(value="@TaxPeriod")
    public String taxPeriod;

    @JsonProperty(value="@PayFrequency")
    public String payFrequency;

    @JsonProperty(value="@Format")
    public String format;

    @JsonProperty(value="@EndDate")
    public Boolean endDate = false;







}
