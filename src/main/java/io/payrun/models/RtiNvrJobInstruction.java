package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RtiNvrJobInstruction")
public class RtiNvrJobInstruction
{

    @JsonProperty(value="HoldingDate")
    public java.util.Date holdingDate;

    @JsonProperty(value="Generate")
    public Boolean generate = false;

    @JsonProperty(value="Transmit")
    public Boolean transmit = false;

    @JsonProperty(value="TaxYear")
    public java.lang.Integer taxYear;

    @JsonProperty(value="Employer")
    public Link employer;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @JsonProperty(value="Timestamp")
    public java.util.Date timestamp;
}
