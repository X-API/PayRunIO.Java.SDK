package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Query")
public class Query
{

    @JsonProperty(value="RootNodeName")
    public String rootNodeName;

    @JsonProperty(value="Variables")
    public variablesWrapper variables;

    @JsonProperty(value="RequiredVariables")
    public requiredVariablesWrapper requiredVariables;

    @JsonProperty(value="Groups")
    public groupsWrapper groups;

    public Query(){
        this.variables = new variablesWrapper();
        this.variables.instance = new java.util.ArrayList<>();
        this.requiredVariables = new requiredVariablesWrapper();
        this.requiredVariables.instance = new java.util.ArrayList<>();
        this.groups = new groupsWrapper();
        this.groups.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<NameValuePair> getVariables() {
        return this.variables.instance;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<String> getRequiredVariables() {
        return this.requiredVariables.instance;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<EntityGroup> getGroups() {
        return this.groups.instance;
    }

    public class variablesWrapper { 
        @JsonProperty(value="Variable")
        public java.util.ArrayList<NameValuePair> instance;
    }

    public class requiredVariablesWrapper { 
        @JsonProperty(value="Variable")
        public java.util.ArrayList<String> instance;
    }

    public class groupsWrapper { 
        @JsonProperty(value="Group")
        public java.util.ArrayList<EntityGroup> instance;
    }
}
