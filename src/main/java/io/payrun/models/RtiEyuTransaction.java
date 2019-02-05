package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RtiEyuTransaction")
public class RtiEyuTransaction
{

    @JsonProperty(value="RtiType")
    public String rtiType;

    @JsonProperty(value="TransactionStatus")
    public RtiTransactionStatus transactionStatus = RtiTransactionStatus.New;

    @JsonProperty(value="Timestamp")
    public java.util.Date timestamp;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
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

    @JsonProperty(value="PaySchedule")
    public Link paySchedule;

    @JsonProperty(value="EarlierTaxYear")
    public java.lang.Short earlierTaxYear;

    public class CDataWrapper { 
        @JsonProperty(value="#cdata-section")
        public String value;
    }
}
