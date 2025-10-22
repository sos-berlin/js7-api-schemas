
package com.sos.joc.model.inventory.dependencies.get;

import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sos.joc.model.inventory.ConfigurationObject;
import com.sos.joc.model.inventory.common.ConfigurationType;
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
    "name",
    "type",
    "configuration",
    "references",
    "referencedBy"
})
public class RequestedResponseItem {

    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private ConfigurationType type;
    /**
     * JS Object configuration
     * <p>
     * 
     * 
     */
    @JsonProperty("configuration")
    private ConfigurationObject configuration;
    @JsonProperty("references")
    @JsonDeserialize(as = java.util.HashSet.class)
    private Set<ConfigurationObject> references = new HashSet<ConfigurationObject>();
    @JsonProperty("referencedBy")
    @JsonDeserialize(as = java.util.HashSet.class)
    private Set<ConfigurationObject> referencedBy = new HashSet<ConfigurationObject>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("type")
    public ConfigurationType getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(ConfigurationType type) {
        this.type = type;
    }

    /**
     * JS Object configuration
     * <p>
     * 
     * 
     */
    @JsonProperty("configuration")
    public ConfigurationObject getConfiguration() {
        return configuration;
    }

    /**
     * JS Object configuration
     * <p>
     * 
     * 
     */
    @JsonProperty("configuration")
    public void setConfiguration(ConfigurationObject configuration) {
        this.configuration = configuration;
    }

    @JsonProperty("references")
    public Set<ConfigurationObject> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(Set<ConfigurationObject> references) {
        this.references = references;
    }

    @JsonProperty("referencedBy")
    public Set<ConfigurationObject> getReferencedBy() {
        return referencedBy;
    }

    @JsonProperty("referencedBy")
    public void setReferencedBy(Set<ConfigurationObject> referencedBy) {
        this.referencedBy = referencedBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("type", type).append("configuration", configuration).append("references", references).append("referencedBy", referencedBy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestedResponseItem) == false) {
            return false;
        }
        RequestedResponseItem rhs = ((RequestedResponseItem) other);
        return new EqualsBuilder().append(name, rhs.name).append(type, rhs.type).isEquals();
    }

}
