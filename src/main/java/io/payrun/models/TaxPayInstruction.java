package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "TaxPayInstruction")
public class TaxPayInstruction extends PayInstruction
{

    @JsonProperty(value="TaxBasis")
    public TaxBasis taxBasis = TaxBasis.Cumulative;

    @JsonProperty(value="TaxCode")
    public String taxCode;

    @JsonProperty(value="WithholdRefund")
    public Boolean withholdRefund;
}
