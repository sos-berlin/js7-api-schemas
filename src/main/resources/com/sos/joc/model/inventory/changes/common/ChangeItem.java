
package com.sos.joc.model.inventory.changes.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
    "path",
    "objectType"
})
public class ChangeItem {

    /**
     * string without < and >
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * path
     * <p>
     * absolute path of an object.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("absolute path of an object.")
    private String path;
    /**
     * configuration types
     * <p>
     * 
     * 
     */
    @JsonProperty("objectType")
    private ConfigurationType objectType;

    /**
     * string without < and >
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * string without < and >
     * <p>
     * 
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * path
     * <p>
     * absolute path of an object.
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * path
     * <p>
     * absolute path of an object.
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * configuration types
     * <p>
     * 
     * 
     */
    @JsonProperty("objectType")
    public ConfigurationType getObjectType() {
        return objectType;
    }

    /**
     * configuration types
     * <p>
     * 
     * 
     */
    @JsonProperty("objectType")
    public void setObjectType(ConfigurationType objectType) {
        this.objectType = objectType;
    }

    public void setObjectType(Integer type) {
        this.objectType = ConfigurationType.fromValue(type);
    }
    
    // default and specific constructors added manually
    public ChangeItem() {
        
    }
    
    public ChangeItem(String name, String path, Integer type) {
        this.name = name;
        this.path = path;
        this.objectType = ConfigurationType.fromValue(type);
    }
    
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("path", path).append("objectType", objectType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(path).append(objectType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChangeItem) == false) {
            return false;
        }
        ChangeItem rhs = ((ChangeItem) other);
        return new EqualsBuilder().append(name, rhs.name).append(path, rhs.path).append(objectType, rhs.objectType).isEquals();
    }

}
