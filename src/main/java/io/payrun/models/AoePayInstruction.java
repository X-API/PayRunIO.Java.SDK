package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "AoePayInstruction")
public class AoePayInstruction extends PayInstruction
{

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
    public java.math.BigDecimal totalToPay;

    @JsonProperty(value="PreviousPayments")
    public java.math.BigDecimal previousPayments;

    @JsonProperty(value="PreviousArrears")
    public java.math.BigDecimal previousArrears;

    @JsonProperty(value="ClaimAdminFee")
    public Boolean claimAdminFee = false;

    @JsonProperty(value="ProtectedEarningsAmount")
    public java.math.BigDecimal protectedEarningsAmount;

    @JsonProperty(value="DeductionAmount")
    public java.math.BigDecimal deductionAmount;

    @JsonProperty(value="ProtectedEarningsPercentage")
    public java.math.BigDecimal protectedEarningsPercentage;

    @JsonProperty(value="DeductionPercentage")
    public java.math.BigDecimal deductionPercentage;

    @JsonProperty(value="BeneficiaryBankAccount")
    public BankAccount beneficiaryBankAccount;
}
