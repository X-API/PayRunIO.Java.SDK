package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayInstruction")
public class PayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="PayLineTag")
    public String payLineTag;
}
