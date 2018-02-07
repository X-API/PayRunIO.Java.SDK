package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "DpsMessage")
public class DpsMessage
{

    @JsonProperty(value="MessageType")
    public String messageType;

    @JsonProperty(value="FormType")
    public String formType;

    @JsonProperty(value="Message")
    public String message;

    @JsonProperty(value="MessageStatus")
    public DpsMessageStatus messageStatus = DpsMessageStatus.Retrieved;

    @JsonProperty(value="IssueDate")
    public java.util.Date issueDate;

    @JsonProperty(value="SequenceNumber")
    public java.lang.Integer sequenceNumber;

    @JsonProperty(value="RetrieveDate")
    public java.util.Date retrieveDate;

    @JsonProperty(value="LastUpdated")
    public java.util.Date lastUpdated;

    @JsonProperty(value="ProcessingResult")
    public String processingResult;
}
