package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "SubContractor")
public class SubContractor
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EffectiveDate")
    public java.util.Date effectiveDate;

    @JsonProperty(value="Revision")
    public java.lang.Integer revision;

    @JsonProperty(value="TradingName")
    public String tradingName;

    @JsonProperty(value="UniqueTaxReference")
    public String uniqueTaxReference;

    @JsonProperty(value="BusinessType")
    public SubContractorType businessType = SubContractorType.SoleTrader;

    @JsonProperty(value="VatRegistered")
    public Boolean vatRegistered = false;

    @JsonProperty(value="VatRegistrationNumber")
    public String vatRegistrationNumber;

    @JsonProperty(value="WorksNumber")
    public String worksNumber;

    @JsonProperty(value="PaymentMethod")
    public PaymentMethod paymentMethod = PaymentMethod.NotSet;

    @JsonProperty(value="PayFrequency")
    public SubContractorPayFrequency payFrequency = SubContractorPayFrequency.Monthly;

    @JsonProperty(value="TaxationStatus")
    public SubContractorTaxationStatus taxationStatus;

    @JsonProperty(value="VerificationNumber")
    public String verificationNumber;

    @JsonProperty(value="VerificationDate")
    public java.util.Date verificationDate;

    @JsonProperty(value="Title")
    public String title;

    @JsonProperty(value="FirstName")
    public String firstName;

    @JsonProperty(value="MiddleName")
    public String middleName;

    @JsonProperty(value="LastName")
    public String lastName;

    @JsonProperty(value="Initials")
    public String initials;

    @JsonProperty(value="NiNumber")
    public String niNumber;

    @JsonProperty(value="Telephone")
    public String telephone;

    @JsonProperty(value="CompanyName")
    public String companyName;

    @JsonProperty(value="CompanyRegistrationNumber")
    public String companyRegistrationNumber;

    @JsonProperty(value="PartnershipName")
    public String partnershipName;

    @JsonProperty(value="PartnershipUniqueTaxReference")
    public String partnershipUniqueTaxReference;

    @JsonProperty(value="Region")
    public CalculatorRegion region = CalculatorRegion.NotSet;

    @JsonProperty(value="Territory")
    public CalculatorTerritory territory = CalculatorTerritory.NotSet;

    @JsonProperty(value="Deactivated")
    public Boolean deactivated = false;

    @JsonProperty(value="Address")
    public Address address;

    @JsonProperty(value="BankAccount")
    public BankAccount bankAccount;
}
