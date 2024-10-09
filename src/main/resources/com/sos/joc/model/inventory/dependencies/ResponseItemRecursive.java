
package com.sos.joc.model.inventory.dependencies;

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
    "dependency",
    "references",
    "referencedBy"
})
public class ResponseItemRecursive {

    /**
     * JS Object configuration
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dependency")
    private ConfigurationObject dependency;
    @JsonProperty("references")
    @JsonDeserialize(as = java.util.HashSet.class)
    private Set<ResponseItemRecursive> references = new HashSet<ResponseItemRecursive>();
    @JsonProperty("referencedBy")
    @JsonDeserialize(as = java.util.HashSet.class)
    private Set<ResponseItemRecursive> referencedBy = new HashSet<ResponseItemRecursive>();

    /**
     * JS Object configuration
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dependency")
    public ConfigurationObject getDependency() {
        return dependency;
    }

    /**
     * JS Object configuration
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("dependency")
    public void setDependency(ConfigurationObject dependency) {
        this.dependency = dependency;
    }

    @JsonProperty("references")
    public Set<ResponseItemRecursive> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(Set<ResponseItemRecursive> references) {
        this.references = references;
    }

    @JsonProperty("referencedBy")
    public Set<ResponseItemRecursive> getReferencedBy() {
        return referencedBy;
    }

    @JsonProperty("referencedBy")
    public void setReferencedBy(Set<ResponseItemRecursive> referencedBy) {
        this.referencedBy = referencedBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dependency", dependency).append("references", references).append("referencedBy", referencedBy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dependency).toHashCode();
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
        return new EqualsBuilder().append(dependency, rhs.dependency).isEquals();
    }

    public ResponseItem(ConfigurationObject item) {
        this.dependency = item;
    }

}
