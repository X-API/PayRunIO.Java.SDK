package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "HmrcSettings")
public class HmrcSettings
{

    @JsonProperty(value="TaxOfficeNumber")
    public String taxOfficeNumber;

    @JsonProperty(value="TaxOfficeReference")
    public String taxOfficeReference;

    @JsonProperty(value="AccountingOfficeRef")
    public String accountingOfficeRef;

    @JsonProperty(value="SAUTR")
    public String sAUTR;

    @JsonProperty(value="COTAXRef")
    public String cOTAXRef;

    @JsonProperty(value="Sender")
    public Sender sender = Sender.Employer;

    @JsonProperty(value="SenderId")
    public String senderId;

    @JsonProperty(value="Password")
    public String password;

    @JsonProperty(value="ContactFirstName")
    public String contactFirstName;

    @JsonProperty(value="ContactLastName")
    public String contactLastName;

    @JsonProperty(value="ContactEmail")
    public String contactEmail;

    @JsonProperty(value="ContactTelephone")
    public String contactTelephone;

    @JsonProperty(value="ContactFax")
    public String contactFax;
}
