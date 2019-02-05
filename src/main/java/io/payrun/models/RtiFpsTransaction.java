package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RtiFpsTransaction")
public class RtiFpsTransaction
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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PaymentDate")
    public java.util.Date paymentDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SchemeCeased")
    public java.util.Date schemeCeased;

    @JsonProperty(value="LateReason")
    public FpsLateReason lateReason;

    public class CDataWrapper { 
        @JsonProperty(value="#cdata-section")
        public String value;
    }
}
