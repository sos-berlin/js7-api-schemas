package com.sos.joc.model.inventory;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sos.joc.model.inventory.common.ConfigurationType;
import com.sos.joc.model.common.IConfigurationObject;
import com.sos.joc.model.inventory.common.ItemStateEnum;
import com.sos.joc.model.inventory.deploy.ResponseDeployableVersion;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * JS Object configuration
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "id",
    "path",
    "objectType",
    "configuration",
    "state",
    "valid",
    "invalidMsg",
    "deleted",
    "deployed",
    "released",
    "hasDeployments",
    "hasReleases",
    "deployments",
    "configurationDate",
    "deliveryDate"
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "objectType", visible = true)
@JsonSubTypes({ 
    @JsonSubTypes.Type(value = com.sos.joc.model.inventory.workflow.WorkflowEdit.class, name = "WORKFLOW"),
    @JsonSubTypes.Type(value = com.sos.joc.model.inventory.job.JobEdit.class, name = "JOB"),
    @JsonSubTypes.Type(value = com.sos.joc.model.inventory.jobclass.JobClassEdit.class, name = "JOBCLASS"),
    @JsonSubTypes.Type(value = com.sos.joc.model.inventory.junction.JunctionEdit.class, name = "JUNCTION"),
    @JsonSubTypes.Type(value = com.sos.joc.model.inventory.lock.LockEdit.class, name = "LOCK"),
    @JsonSubTypes.Type(value = com.sos.joc.model.calendar.WorkingDaysCalendarEdit.class, name = "WORKINGDAYSCALENDAR"),
    @JsonSubTypes.Type(value = com.sos.joc.model.calendar.NonWorkingDaysCalendarEdit.class, name = "NONWORKINGDAYSCALENDAR"),
    @JsonSubTypes.Type(value = com.sos.webservices.order.initiator.model.ScheduleEdit.class, name = "SCHEDULE"),
    @JsonSubTypes.Type(value = com.sos.joc.model.inventory.folder.FolderEdit.class, name = "FOLDER")})
public class ConfigurationObject {

    /**
     * non negative long
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    private Long id;
    /**
     * path
     * <p>
     * absolute path of a JobScheduler object.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("absolute path of a configuration object.")
    private String path;
    /**
     * JobScheduler object type
     * <p>
     * 
     * 
     */
    @JsonProperty("objectType")
    private ConfigurationType objectType;
    /**
     * interface for different json representations of a configuration item
     * 
     */
    @JsonProperty("configuration")
    @JsonPropertyDescription("interface for different json representations of a configuration item")
    private IConfigurationObject configuration;
    /**
     * version state text
     * <p>
     * 
     * 
     */
    @JsonProperty("state")
    private ItemStateEnum state;
    @JsonProperty("valid")
    private Boolean valid;
    @JsonProperty("invalidMsg")
    private String invalidMsg;
    @JsonProperty("deleted")
    private Boolean deleted;
    @JsonProperty("deployed")
    private Boolean deployed;
    @JsonProperty("released")
    private Boolean released;
    @JsonProperty("hasDeployments")
    private Boolean hasDeployments;
    @JsonProperty("hasReleases")
    private Boolean hasReleases;
    @JsonProperty("deployments")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    private Set<ResponseDeployableVersion> deployments = new LinkedHashSet<ResponseDeployableVersion>();
    /**
     * timestamp
     * <p>
     * Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty
     * 
     */
    @JsonProperty("configurationDate")
    @JsonPropertyDescription("Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty")
    private Date configurationDate;
    /**
     * timestamp
     * <p>
     * Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty
     * 
     */
    @JsonProperty("deliveryDate")
    @JsonPropertyDescription("Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty")
    private Date deliveryDate;

    /**
     * non negative long
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * non negative long
     * <p>
     * 
     * 
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * path
     * <p>
     * absolute path of a JobScheduler object.
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * path
     * <p>
     * absolute path of a JobScheduler object.
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * JobScheduler object type
     * <p>
     * 
     * 
     */
    @JsonProperty("objectType")
    public ConfigurationType getObjectType() {
        return objectType;
    }

    /**
     * JobScheduler object type
     * <p>
     * 
     * 
     */
    @JsonProperty("objectType")
    public void setObjectType(ConfigurationType objectType) {
        this.objectType = objectType;
    }

    /**
     * interface for different json representations of a configuration item
     * 
     */
    @JsonProperty("configuration")
    public IConfigurationObject getConfiguration() {
        return configuration;
    }

    /**
     * interface for different json representations of a configuration item
     * 
     */
    @JsonProperty("configuration")
    public void setConfiguration(IConfigurationObject configuration) {
        this.configuration = configuration;
    }

    /**
     * version state text
     * <p>
     * 
     * 
     */
    @JsonProperty("state")
    public ItemStateEnum getState() {
        return state;
    }

    /**
     * version state text
     * <p>
     * 
     * 
     */
    @JsonProperty("state")
    public void setState(ItemStateEnum state) {
        this.state = state;
    }

    @JsonProperty("valid")
    public Boolean getValid() {
        return valid;
    }

    @JsonProperty("valid")
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
    
    @JsonProperty("invalidMsg")
    public String getInvalidMsg() {
        return invalidMsg;
    }

    @JsonProperty("invalidMsg")
    public void setInvalidMsg(String valid) {
        this.invalidMsg = valid;
    }

    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @JsonProperty("deployed")
    public Boolean getDeployed() {
        return deployed;
    }

    @JsonProperty("released")
    public void setReleased(Boolean released) {
        this.released = released;
    }
    
    @JsonProperty("released")
    public Boolean getReleased() {
        return released;
    }
    
    @JsonProperty("hasReleases")
    public void setHasReleases(Boolean hasReleases) {
        this.hasReleases = hasReleases;
    }
    
    @JsonProperty("hasReleases")
    public Boolean getHasReleases() {
        return hasReleases;
    }
    
    @JsonProperty("hasDeployments")
    public void setHasDeployments(Boolean hasDeployments) {
        this.hasDeployments = hasDeployments;
    }
    
    @JsonProperty("hasDeployments")
    public Boolean getHasDeployments() {
        return hasDeployments;
    }

    @JsonProperty("deployed")
    public void setDeployed(Boolean deployed) {
        this.deployed = deployed;
    }

    @JsonProperty("deployments")
    public Set<ResponseDeployableVersion> getDeployments() {
        return deployments;
    }

    @JsonProperty("deployments")
    public void setDeployments(Set<ResponseDeployableVersion> deployments) {
        this.deployments = deployments;
    }

    /**
     * timestamp
     * <p>
     * Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty
     * 
     */
    @JsonProperty("configurationDate")
    public Date getConfigurationDate() {
        return configurationDate;
    }

    /**
     * timestamp
     * <p>
     * Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty
     * 
     */
    @JsonProperty("configurationDate")
    public void setConfigurationDate(Date configurationDate) {
        this.configurationDate = configurationDate;
    }

    /**
     * timestamp
     * <p>
     * Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty
     * 
     */
    @JsonProperty("deliveryDate")
    public Date getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * timestamp
     * <p>
     * Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty
     * 
     */
    @JsonProperty("deliveryDate")
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("path", path).append("objectType", objectType).append("configuration", configuration).append("state", state).append("valid", valid).append("invalidMsg", invalidMsg).append("deleted", deleted).append("deployed", deployed).append("released", released).append("hasReleases", hasReleases).append("hasDeployments", hasDeployments).append("deployments", deployments).append("configurationDate", configurationDate).append("deliveryDate", deliveryDate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(valid).append(configurationDate).append(path).append(deleted).append(configuration).append(deployed).append(released).append(id).append(state).append(deliveryDate).append(objectType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationObject) == false) {
            return false;
        }
        ConfigurationObject rhs = ((ConfigurationObject) other);
        return new EqualsBuilder().append(valid, rhs.valid).append(configurationDate, rhs.configurationDate).append(path, rhs.path).append(deleted, rhs.deleted).append(released, rhs.released).append(configuration, rhs.configuration).append(deployed, rhs.deployed).append(id, rhs.id).append(state, rhs.state).append(deliveryDate, rhs.deliveryDate).append(objectType, rhs.objectType).isEquals();
    }

}