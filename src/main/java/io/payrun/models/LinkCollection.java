package io.payrun.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "LinkCollection")
public class LinkCollection
{

    @JsonProperty(value="Links")
    public linksWrapper links;

    public LinkCollection(){
        this.links = new linksWrapper();
        this.links.instance = new java.util.ArrayList<>();
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    public java.util.ArrayList<Link> getLinks() {
        return this.links.instance;
    }

    public class linksWrapper { 
        @JsonProperty(value="Link")
        public java.util.ArrayList<Link> instance;
    }
}
