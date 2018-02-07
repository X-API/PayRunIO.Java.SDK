package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PaySchedule")
public class PaySchedule
{

    @JsonProperty(value="Name")
    public String name;

    @JsonProperty(value="PayFrequency")
    public PayFrequency payFrequency = PayFrequency.Weekly;
}
