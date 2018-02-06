package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "EntityGroup")
public class EntityGroup
{

    @JsonProperty(value="@GroupName")
    public String groupName;

    @JsonProperty(value="@ItemName")
    public String itemName;

    @JsonProperty(value="@Selector")
    public String selector;

    @JsonProperty(value="@UniqueKeyVariable")
    public String uniqueKeyVariable;

    @JsonProperty(value="@LoopExpression")
    public String loopExpression;

    @JsonProperty(value="Condition")
    public java.util.ArrayList<CompareConditionBase> conditions;

    @JsonProperty(value="Filter")
    public java.util.ArrayList<FilterBase> filters;

    @JsonProperty(value="Output")
    public java.util.ArrayList<OutputBase> outputs;

    @JsonProperty(value="Order")
    public java.util.ArrayList<OrderByBase> ordering;

    @JsonProperty(value="Group")
    public java.util.ArrayList<EntityGroup> groups;










}
