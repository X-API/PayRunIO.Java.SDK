package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "DpsJobInstruction")
public class DpsJobInstruction
{

    @JsonProperty(value="HoldingDate")
    public java.util.Date holdingDate;

    @JsonProperty(value="Retrieve")
    public Boolean retrieve = false;

    @JsonProperty(value="Apply")
    public Boolean apply = false;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="FromDate")
    public java.util.Date fromDate;

    @JsonProperty(value="Employer")
    public Link employer;

    @JsonProperty(value="MessageTypes")
    public messageTypesWrapper messageTypes;

    @JsonProperty(value="MessagesToProcess")
    public messagesToProcessWrapper messagesToProcess;

    public DpsJobInstruction(){
        this.messageTypes = new messageTypesWrapper();
        this.messageTypes.instance = new java.util.ArrayList<>();
        this.messagesToProcess = new messagesToProcessWrapper();
        this.messagesToProcess.instance = new java.util.ArrayList<>();
    }






    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<DpsMessageType> getMessageTypes() {
        return this.messageTypes.instance;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<Link> getMessagesToProcess() {
        return this.messagesToProcess.instance;
    }

    public class messageTypesWrapper { 
        @JsonProperty(value="Type")
        public java.util.ArrayList<DpsMessageType> instance;
    }

    public class messagesToProcessWrapper { 
        @JsonProperty(value="Message")
        public java.util.ArrayList<Link> instance;
    }
}
