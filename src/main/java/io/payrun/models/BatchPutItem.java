package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PUT")
public class BatchPutItem extends BatchItemBase
{

    @JsonProperty(value="Body")
    public Object body;
}
