package com.sos.controller.model.event;

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
 * event
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME, 
		include = JsonTypeInfo.As.PROPERTY, 
		property = "TYPE",
		visible = true)
@JsonSubTypes({ 
		@JsonSubTypes.Type(value = OrderAdded.class, name = "OrderAdded"),
		@JsonSubTypes.Type(value = OrderAttached.class, name = "OrderAttached"),
		@JsonSubTypes.Type(value = OrderTransferredToAgent.class, name = "OrderTransferredToAgent"),
		@JsonSubTypes.Type(value = OrderProcessingStarted.class, name = "OrderProcessingStarted"),
		@JsonSubTypes.Type(value = OrderStdoutWritten.class, name = "OrderStdoutWritten"),
		@JsonSubTypes.Type(value = OrderStderrWritten.class, name = "OrderStderrWritten"),
		@JsonSubTypes.Type(value = OrderProcessed.class, name = "OrderProcessed"),
		@JsonSubTypes.Type(value = OrderForked.class, name = "OrderForked"),
		@JsonSubTypes.Type(value = OrderJoined.class, name = "OrderJoined"),
		@JsonSubTypes.Type(value = OrderOffered.class, name = "OrderOffered"),
		@JsonSubTypes.Type(value = OrderAwaiting.class, name = "OrderAwaiting"),
		@JsonSubTypes.Type(value = OrderMoved.class, name = "OrderMoved"),
		@JsonSubTypes.Type(value = OrderDetachable.class, name = "OrderDetachable"),
		@JsonSubTypes.Type(value = OrderDetached.class, name = "OrderDetached"),
		@JsonSubTypes.Type(value = OrderFinished.class, name = "OrderFinished") })
@JsonPropertyOrder({
    "TYPE",
    "eventId"
})
public abstract class Event extends ClassHelper {

    /**
     * eventType
     * <p>
     * 
     * (Required)
     * 
     */
	@JsonIgnore
	@JsonProperty("TYPE")
    private EventType tYPE;
    /**
     * non negative long
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eventId")
    private Long eventId;
    
    /**
     * No args constructor for use in serialization
     * 
     */
    public Event() {
    }

    /**
     * 
     * @param eventId
     * @param tYPE
     */
    public Event(Long eventId) {
        super();
        this.eventId = eventId;
    }

    /**
     * eventType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonIgnore
	@JsonProperty("TYPE")
    public EventType getTYPE() {
        return tYPE;
    }

    /**
     * eventType
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("TYPE")
    public void setTYPE(EventType tYPE) {
        this.tYPE = tYPE;
    }

    /**
     * non negative long
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eventId")
    public Long getEventId() {
        return eventId;
    }

    /**
     * non negative long
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("eventId")
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tYPE", tYPE).append("eventId", eventId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tYPE).append(eventId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Event) == false) {
            return false;
        }
        Event rhs = ((Event) other);
        return new EqualsBuilder().append(tYPE, rhs.tYPE).append(eventId, rhs.eventId).isEquals();
    }

}
