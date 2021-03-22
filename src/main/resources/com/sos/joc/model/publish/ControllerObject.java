package com.sos.joc.model.publish;

import java.util.Date;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sos.inventory.model.deploy.DeployType;
import com.sos.joc.model.common.IDeployObject;


/**
 * Controller Object configuration
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "account",
    "path",
    "objectType",
    "content",
    "signedContent",
    "version",
    "commitId",
    "comment",
    "modified"
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "objectType", visible = true)
@JsonSubTypes({ 
	@JsonSubTypes.Type(value = com.sos.joc.model.inventory.workflow.WorkflowPublish.class, name = "Workflow"),
	@JsonSubTypes.Type(value = com.sos.joc.model.inventory.jobclass.JobClassPublish.class, name = "JobClass"),
	@JsonSubTypes.Type(value = com.sos.joc.model.inventory.junction.JunctionPublish.class, name = "Junction"),
	@JsonSubTypes.Type(value = com.sos.joc.model.inventory.lock.LockPublish.class, name = "Lock"),
	@JsonSubTypes.Type(value = com.sos.joc.model.inventory.fileordersource.FileOrderSourcePublish.class, name = "FileOrderSource")})
public class ControllerObject {

    /**
     * non negative long
     */
    @JsonProperty("id")
    private Long id;
    @JsonProperty("account")
    private String account;
    @JsonProperty("path")
    private String path;
    @JsonProperty("objectType")
    private DeployType objectType;
    @JsonProperty("content")
    private IDeployObject content;
    @JsonProperty("signedContent")
    private String signedContent;
    @JsonProperty("version")
    private String version;
    @JsonProperty("commitId")
    private String commitId;
    @JsonProperty("comment")
    private String comment;
    /**
     * timestamp
     * <p>
     * Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty
     */
    @JsonProperty("modified")
    @JsonPropertyDescription("Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty")
    private Date modified;

    /**
     * non negative long
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }
    /**
     * non negative long
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("account")
    public String getAccount() {
        return account;
    }
    @JsonProperty("account")
    public void setAccount(String account) {
        this.account = account;
    }

    @JsonProperty("path")
    public String getPath() {
        return path;
    }
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("objectType")
    public DeployType getObjectType() {
        return objectType;
    }
    @JsonProperty("objectType")
    public void setObjectType(DeployType objectType) {
        this.objectType = objectType;
    }

    @JsonProperty("content")
    public IDeployObject getContent() {
        return content;
    }
    @JsonProperty("content")
    public void setContent(IDeployObject content) {
        this.content = content;
    }

    @JsonProperty("signedContent")
    public String getSignedContent() {
        return signedContent;
    }
    @JsonProperty("signedContent")
    public void setSignedContent(String signedContent) {
        this.signedContent = signedContent;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("commitId")
    public String getCommitId() {
        return commitId;
    }
    @JsonProperty("commitId")
    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * timestamp
     * <p>
     * Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty
     */
    @JsonProperty("modified")
    public Date getModified() {
        return modified;
    }
    /**
     * timestamp
     * <p>
     * Value is UTC timestamp in ISO 8601 YYYY-MM-DDThh:mm:ss.sZ or empty
     */
    @JsonProperty("modified")
    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("id", id).append("account", account).append("path", path)
                .append("objectType", objectType).append("content", content).append("signedContent", signedContent).append("version", version)
                .append("commitId", commitId).append("comment", comment).append("modified", modified).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(id).append(account).append(path).append(objectType).append(content)
                .append(signedContent).append(version).append(commitId).append(comment).append(modified).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ControllerObject) == false) {
            return false;
        }
        ControllerObject rhs = ((ControllerObject) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(id, rhs.id).append(account, rhs.account).append(path, rhs.path)
                .append(objectType, rhs.objectType).append(content, rhs.content).append(signedContent, rhs.signedContent).append(version, rhs.version)
                .append(commitId, rhs.commitId).append(comment, rhs.comment).append(modified, rhs.modified).isEquals();
    }

}
