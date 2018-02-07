package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Pension")
public class Pension
{

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EffectiveDate")
    public java.util.Date effectiveDate;

    @JsonProperty(value="Revision")
    public java.lang.Integer revision;

    @JsonProperty(value="SchemeName")
    public String schemeName;

    @JsonProperty(value="ProviderName")
    public String providerName;

    @JsonProperty(value="ProviderEmployerRef")
    public String providerEmployerRef;

    @JsonProperty(value="Group")
    public String group;

    @JsonProperty(value="SubGroup")
    public String subGroup;

    @JsonProperty(value="EmployeeContributionCash")
    public java.lang.Double employeeContributionCash;

    @JsonProperty(value="EmployerContributionCash")
    public java.lang.Double employerContributionCash;

    @JsonProperty(value="EmployeeContributionPercent")
    public java.lang.Double employeeContributionPercent;

    @JsonProperty(value="EmployerContributionPercent")
    public java.lang.Double employerContributionPercent;

    @JsonProperty(value="LowerThreshold")
    public java.lang.Double lowerThreshold;

    @JsonProperty(value="UpperThreshold")
    public java.lang.Double upperThreshold;

    @JsonProperty(value="TaxationMethod")
    public PensionTaxationMethod taxationMethod = PensionTaxationMethod.NotSet;

    @JsonProperty(value="Code")
    public String code;

    @JsonProperty(value="ContributionDeductionDay")
    public java.lang.Integer contributionDeductionDay;

    @JsonProperty(value="SalarySacrifice")
    public Boolean salarySacrifice = false;

    @JsonProperty(value="ProRataMethod")
    public ProRataMethod proRataMethod = ProRataMethod.NotSet;

    @JsonProperty(value="AECompatible")
    public Boolean aECompatible = false;

    @JsonProperty(value="UseAEThresholds")
    public Boolean useAEThresholds = false;

    @JsonProperty(value="PensionablePayCodes")
    public pensionablePayCodesWrapper pensionablePayCodes;

    @JsonProperty(value="QualifyingPayCodes")
    public qualifyingPayCodesWrapper qualifyingPayCodes;

    public Pension(){
        this.pensionablePayCodes = new pensionablePayCodesWrapper();
        this.pensionablePayCodes.instance = new java.util.ArrayList<>();
        this.qualifyingPayCodes = new qualifyingPayCodesWrapper();
        this.qualifyingPayCodes.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<String> getPensionablePayCodes() {
        return this.pensionablePayCodes.instance;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<String> getQualifyingPayCodes() {
        return this.qualifyingPayCodes.instance;
    }

    public class pensionablePayCodesWrapper { 
        @JsonProperty(value="PayCode")
        public java.util.ArrayList<String> instance;
    }

    public class qualifyingPayCodesWrapper { 
        @JsonProperty(value="PayCode")
        public java.util.ArrayList<String> instance;
    }
}
