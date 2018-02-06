package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "ErrorModel")
public class ErrorModel
{

    @JsonProperty(value="ErrorCategory")
    public ErrorCategory errorCategory = ErrorCategory.General;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="Errors")
    public errorsWrapper errors;

    public ErrorModel(){
        this.errors = new errorsWrapper();
        this.errors.instance = new java.util.ArrayList<>();
    }



    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<String> getErrors() {
        return this.errors.instance;
    }

    public class errorsWrapper { 
        @JsonProperty(value="Error")
        public java.util.ArrayList<String> instance;
    }
}
