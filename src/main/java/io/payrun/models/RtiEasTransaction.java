package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RtiEasTransaction")
public class RtiEasTransaction
{

    @JsonProperty(value="RtiType")
    public String rtiType;

    @JsonProperty(value="TransactionStatus")
    public RtiTransactionStatus transactionStatus = RtiTransactionStatus.New;

    @JsonProperty(value="Timestamp")
    public java.util.Date timestamp;

    @JsonProperty(value="TransmissionDate")
    public java.util.Date transmissionDate;

    @JsonProperty(value="TaxYear")
    public java.lang.Short taxYear;

    @JsonProperty(value="RequestData")
    public CDataWrapper requestData;

    @JsonProperty(value="ResponseData")
    public CDataWrapper responseData;

    @JsonProperty(value="EmployerCore")
    public Link employerCore;

    public class CDataWrapper { 
        @JsonProperty(value="#cdata-section")
        public String value;
    }
}
