package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "EmployeePartner")
public class EmployeePartner
{

    @JsonProperty(value="FirstName")
    public String firstName;

    @JsonProperty(value="MiddleName")
    public String middleName;

    @JsonProperty(value="Initials")
    public String initials;

    @JsonProperty(value="LastName")
    public String lastName;

    @JsonProperty(value="NiNumber")
    public String niNumber;





}
