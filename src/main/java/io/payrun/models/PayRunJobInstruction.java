package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "PayRunJobInstruction")
public class PayRunJobInstruction
{

    @JsonProperty(value="HoldingDate")
    public java.util.Date holdingDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="PaymentDate")
    public java.util.Date paymentDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="StartDate")
    public java.util.Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty(value="EndDate")
    public java.util.Date endDate;

    @JsonProperty(value="PaySchedule")
    public Link paySchedule;

    @JsonProperty(value="IsSupplementary")
    public Boolean isSupplementary = false;

    @JsonProperty(value="Employees")
    public employeesWrapper employees;

    public PayRunJobInstruction(){
        this.employees = new employeesWrapper();
        this.employees.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<Link> getEmployees() {
        return this.employees.instance;
    }

    public class employeesWrapper { 
        @JsonProperty(value="Employee")
        public java.util.ArrayList<Link> instance;
    }
}
