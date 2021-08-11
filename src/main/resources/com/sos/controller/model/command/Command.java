
package com.sos.controller.model.command;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sos.inventory.model.common.ClassHelper;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * abstract command
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TYPE"
})
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME, 
		include = JsonTypeInfo.As.PROPERTY, 
		property = "TYPE",
		visible = true)
@JsonSubTypes({ 
        @JsonSubTypes.Type(value = JSBatchCommands.class, name = "Batch"),
        @JsonSubTypes.Type(value = CancelOrder.class, name = "CancelOrders"), 
        @JsonSubTypes.Type(value = SuspendOrder.class, name = "SuspendOrders"), 
        @JsonSubTypes.Type(value = ResumeOrder.class, name = "ResumeOrders"), 
        @JsonSubTypes.Type(value = ResumeOrder.class, name = "ResumeOrder"), 
        @JsonSubTypes.Type(value = Abort.class, name = "EmergencyStop"),
        @JsonSubTypes.Type(value = Terminate.class, name = "ShutDown"), 
        @JsonSubTypes.Type(value = ReplaceRepo.class, name = "ReplaceRepo"),
        @JsonSubTypes.Type(value = UpdateRepo.class, name = "UpdateRepo"),
        @JsonSubTypes.Type(value = ClusterSwitchOver.class, name = "ClusterSwitchOver"),
        @JsonSubTypes.Type(value = ClusterAppointNodes.class, name = "ClusterAppointNodes"),
        @JsonSubTypes.Type(value = ReleaseEvents.class, name = "ReleaseEvents"),
        @JsonSubTypes.Type(value = ResetAgent.class, name = "ResetAgent"),
        @JsonSubTypes.Type(value = DeleteNotice.class, name = "DeleteNotice"),
        @JsonSubTypes.Type(value = PostNotice.class, name = "PostNotice")})
public abstract class Command
    extends ClassHelper
{

    /**
     * commandType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TYPE")
    @JsonIgnore
    private CommandType tYPE;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Command() {
    }

    /**
     * 
     * @param tYPE
     */
    public Command(CommandType tYPE) {
        super();
        this.tYPE = tYPE;
    }

    /**
     * commandType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TYPE")
    @JsonIgnore
    public CommandType getTYPE() {
        return tYPE;
    }

    /**
     * commandType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TYPE")
    public void setTYPE(CommandType tYPE) {
        this.tYPE = tYPE;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("tYPE", tYPE).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(tYPE).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Command) == false) {
            return false;
        }
        Command rhs = ((Command) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(tYPE, rhs.tYPE).isEquals();
    }

}
