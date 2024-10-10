
package com.sos.joc.model.inventory.dependencies.get;

import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sos.joc.model.inventory.ConfigurationObject;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * dependencies
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "requestedItems",
    "affectedItems"
})
public class ResponseItem {

    @JsonProperty("requestedItems")
    @JsonDeserialize(as = java.util.HashSet.class)
    private Set<RequestedResponseItem> requestedItems = new HashSet<RequestedResponseItem>();
    @JsonProperty("affectedItems")
    @JsonDeserialize(as = java.util.HashSet.class)
    private Set<ConfigurationObject> affectedItems = new HashSet<ConfigurationObject>();

    @JsonProperty("requestedItems")
    public Set<RequestedResponseItem> getRequestedItems() {
        return requestedItems;
    }

    @JsonProperty("requestedItems")
    public void setRequestedItems(Set<RequestedResponseItem> requestedItems) {
        this.requestedItems = requestedItems;
    }

    @JsonProperty("affectedItems")
    public Set<ConfigurationObject> getAffectedItems() {
        return affectedItems;
    }

    @JsonProperty("affectedItems")
    public void setAffectedItems(Set<ConfigurationObject> affectedItems) {
        this.affectedItems = affectedItems;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("requestedItems", requestedItems).append("affectedItems", affectedItems).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requestedItems).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResponseItem) == false) {
            return false;
        }
        ResponseItem rhs = ((ResponseItem) other);
        return new EqualsBuilder().append(requestedItems, rhs.requestedItems).isEquals();
    }

}
