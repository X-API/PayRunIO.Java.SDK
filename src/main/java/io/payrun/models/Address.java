package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Address")
public class Address
{

    @JsonProperty(value="Address1")
    public String address1;

    @JsonProperty(value="Address2")
    public String address2;

    @JsonProperty(value="Address3")
    public String address3;

    @JsonProperty(value="Address4")
    public String address4;

    @JsonProperty(value="Postcode")
    public String postcode;

    @JsonProperty(value="Country")
    public String country;
}
