
package com.sos.joc.model.reporting;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStepsColumns {

    ID("id"),
    CONTROLLER_ID("controllerId"),
    ORDER_ID("orderId"),
    WORKFLOW_PATH("workflowPath"),
    WORKFLOW_VERSION_ID("workflowVersionId"),
    WORKFLOW_POSITION("workflowPosition"),
    WORKFLOW_FOLDER("workflowFolder"),
    WORKFLOW_NAME("workflowName"),
    POSITION("position"),
    RETRY_COUNTER("retryCounter"),
    JOB_NAME("jobName"),
    JOB_LABEL("jobLabel"),
    JOB_TITLE("jobTitle"),
    JOB_NOTIFICATION("jobNotification"),
    CRITICALITY("criticality"),
    AGENT_ID("agentId"),
    AGENT_NAME("agentName"),
    AGENT_URI("agentUri"),
    SUBAGENT_CLUSTER_ID("subagentClusterId"),
    START_CAUSE("startCause"),
    START_TIME("startTime"),
    START_VARIABLES("startVariables"),
    END_TIME("endTime"),
    END_VARIABLES("endVariables"),
    RETURN_CODE("returnCode"),
    ERROR("error"),
    ERROR_STATE("errorState"),
    ERROR_REASON("errorReason"),
    ERROR_CODE("errorCode"),
    ERROR_TEXT("errorText"),
    CREATED("created"),
    MODIFIED("modified");
    private final String strValue;
    private final static Map<String, OrderStepsColumns> CONSTANTS = new HashMap<String, OrderStepsColumns>();
    private final static Map<String, OrderStepsColumns> STRCONSTANTS = new HashMap<String, OrderStepsColumns>();

    static {
        for (OrderStepsColumns c: values()) {
            CONSTANTS.put(c.name(), c);
            STRCONSTANTS.put(c.strValue, c);
        }
    }

    private OrderStepsColumns(String strValue) {
        this.strValue = strValue;
    }

    @Override
    public String toString() {
        return this.name();
    }

    @JsonValue
    public String value() {
        return this.name();
    }

    public String strValue() {
        return this.strValue;
    }

    @JsonCreator
    public static OrderStepsColumns fromValue(String value) {
        OrderStepsColumns constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static OrderStepsColumns fromStrValue(String strValue) {
        OrderStepsColumns constant = STRCONSTANTS.get(strValue);
        if (constant == null) {
            throw new IllegalArgumentException(strValue);
        } else {
            return constant;
        }
    }

}
