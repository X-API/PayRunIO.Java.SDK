package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "JobInfo")
public class JobInfo
{

    @JsonProperty(value="JobId")
    public String jobId;

    @JsonProperty(value="Created")
    public java.util.Date created;

    @JsonProperty(value="LastUpdated")
    public java.util.Date lastUpdated;

    @JsonProperty(value="JobType")
    public String jobType;

    @JsonProperty(value="JobStatus")
    public JobStatus jobStatus = JobStatus.New;

    @JsonProperty(value="Progress")
    public java.lang.Double progress = Double.valueOf(0);;

    @JsonProperty(value="HoldingDate")
    public java.util.Date holdingDate;

    @JsonProperty(value="Errors")
    public errorsWrapper errors;

    public JobInfo(){
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
