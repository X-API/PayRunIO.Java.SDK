package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "CisVerifyJobInstruction")
public class CisVerifyJobInstruction
{

    @JsonProperty(value="HoldingDate")
    public java.util.Date holdingDate;

    @JsonProperty(value="Employer")
    public Link employer;

    @JsonProperty(value="SubContractors")
    public subContractorsWrapper subContractors;

    @JsonProperty(value="Timestamp")
    public java.util.Date timestamp;

    @JsonProperty(value="Generate")
    public Boolean generate = false;

    @JsonProperty(value="Transmit")
    public Boolean transmit = false;

    @JsonProperty(value="Declaration")
    public Boolean declaration = false;

    public CisVerifyJobInstruction(){
        this.subContractors = new subContractorsWrapper();
        this.subContractors.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<Link> getSubContractors() {
        return this.subContractors.instance;
    }

    public class subContractorsWrapper { 
        @JsonProperty(value="SubContractor")
        public java.util.ArrayList<Link> instance;
    }
}
