package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "AoePayInstruction")
public class AoePayInstruction extends PayInstruction
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="Description")
    public String description;

    @JsonProperty(value="CaseNumber")
    public String caseNumber;

    @JsonProperty(value="AoeType")
    public String aoeType;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="IssueDate")
    public java.util.Date issueDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StopDate")
    public java.util.Date stopDate;

    @JsonProperty(value="TotalToPay")
    public java.lang.Double totalToPay;

    @JsonProperty(value="PreviousPayments")
    public java.lang.Double previousPayments;

    @JsonProperty(value="PreviousArrears")
    public java.lang.Double previousArrears;

    @JsonProperty(value="ClaimAdminFee")
    public Boolean claimAdminFee = false;

    @JsonProperty(value="ProtectedEarningsAmount")
    public java.lang.Double protectedEarningsAmount;

    @JsonProperty(value="DeductionAmount")
    public java.lang.Double deductionAmount;

    @JsonProperty(value="ProtectedEarningsPercentage")
    public java.lang.Double protectedEarningsPercentage;

    @JsonProperty(value="DeductionPercentage")
    public java.lang.Double deductionPercentage;
}
