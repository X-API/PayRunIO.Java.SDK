package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "BatchJobInstruction")
public class BatchJobInstruction
{

    @JsonProperty(value="HoldingDate")
    public java.util.Date holdingDate;

    @JsonProperty(value="ValidateOnly")
    public Boolean validateOnly = false;

    @JsonProperty(value="Instructions")
    public instructionsWrapper instructions;

    public BatchJobInstruction(){
        this.instructions = new instructionsWrapper();
        this.instructions.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<BatchItemBase> getInstructions() {
        return this.instructions.instance;
    }

    public class instructionsWrapper { 
        @JsonProperty(value="DELETE")
        public java.util.ArrayList<BatchItemBase> instance;
    }
}
