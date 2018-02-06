package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "BankAccount")
public class BankAccount
{

    @JsonProperty(value="AccountName")
    public String accountName;

    @JsonProperty(value="AccountNumber")
    public String accountNumber;

    @JsonProperty(value="SortCode")
    public String sortCode;



}
