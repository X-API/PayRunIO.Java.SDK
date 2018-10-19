package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "CisReturnJobInstruction")
public class CisReturnJobInstruction
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

    @JsonProperty(value="NilReturn")
    public Boolean nilReturn;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonProperty(value="InformationCorrect")
    public Boolean informationCorrect = false;

    @JsonProperty(value="EmploymentStatus")
    public Boolean employmentStatus = false;

    @JsonProperty(value="Verification")
    public Boolean verification = false;

    @JsonProperty(value="Inactivity")
    public Boolean inactivity = false;

    public CisReturnJobInstruction(){
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
