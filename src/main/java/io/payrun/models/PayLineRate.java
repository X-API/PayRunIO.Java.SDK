package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayLineRate")
public class PayLineRate extends PayLine
{

    @JsonProperty(value="Rate")
    public java.lang.Double rate = 0d;;

    @JsonProperty(value="RateUoM")
    public UomBasicPay rateUoM = UomBasicPay.NotSet;

    @JsonProperty(value="Units")
    public java.lang.Double units = 0d;;

    @JsonProperty(value="ProRataMethodApplied")
    public ProRataMethod proRataMethodApplied = ProRataMethod.NotSet;
}
