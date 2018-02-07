package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "EmployerAutoEnrolment")
public class EmployerAutoEnrolment
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StagingDate")
    public java.util.Date stagingDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PostponementDate")
    public java.util.Date postponementDate;

    @JsonProperty(value="ReEnrolmentDayOffset")
    public java.lang.Integer reEnrolmentDayOffset;

    @JsonProperty(value="ReEnrolmentMonthOffset")
    public java.lang.Integer reEnrolmentMonthOffset;

    @JsonProperty(value="PrimaryFirstName")
    public String primaryFirstName;

    @JsonProperty(value="PrimaryLastName")
    public String primaryLastName;

    @JsonProperty(value="PrimaryEmail")
    public String primaryEmail;

    @JsonProperty(value="PrimaryTelephone")
    public String primaryTelephone;

    @JsonProperty(value="PrimaryJobTitle")
    public String primaryJobTitle;

    @JsonProperty(value="SecondaryFirstName")
    public String secondaryFirstName;

    @JsonProperty(value="SecondaryLastName")
    public String secondaryLastName;

    @JsonProperty(value="SecondaryEmail")
    public String secondaryEmail;

    @JsonProperty(value="SecondaryTelephone")
    public String secondaryTelephone;

    @JsonProperty(value="SecondaryJobTitle")
    public String secondaryJobTitle;

    @JsonProperty(value="Pension")
    public Link pension;
}
