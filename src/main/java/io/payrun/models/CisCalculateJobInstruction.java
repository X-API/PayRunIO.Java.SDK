package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "CisCalculateJobInstruction")
public class CisCalculateJobInstruction
{

    @JsonProperty(value="HoldingDate")
    public java.util.Date holdingDate;

    @JsonProperty(value="Employer")
    public Link employer;

    @JsonProperty(value="SubContractors")
    public subContractorsWrapper subContractors;

    @JsonProperty(value="PayFrequency")
    public SubContractorPayFrequency payFrequency = SubContractorPayFrequency.Monthly;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxPeriod")
    public java.lang.Short taxPeriod;

    public CisCalculateJobInstruction(){
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
