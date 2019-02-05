package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "RtiEpsTransaction")
public class RtiEpsTransaction
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

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="SchemeCeased")
    public java.util.Date schemeCeased;

    @JsonProperty(value="TaxMonth")
    public java.lang.Short taxMonth;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="NoPaymentForPeriodFrom")
    public java.util.Date noPaymentForPeriodFrom;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="NoPaymentForPeriodTo")
    public java.util.Date noPaymentForPeriodTo;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PeriodOfInactivityFrom")
    public java.util.Date periodOfInactivityFrom;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PeriodOfInactivityTo")
    public java.util.Date periodOfInactivityTo;

    public class CDataWrapper { 
        @JsonProperty(value="#cdata-section")
        public String value;
    }
}
