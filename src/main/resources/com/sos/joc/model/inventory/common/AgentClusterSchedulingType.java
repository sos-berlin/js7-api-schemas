
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum AgentClusterSchedulingType {

    FIXED_PRIORITY(0),
    ROUND_ROBIN(1);
    private final Integer intValue;
    private final static Map<String, AgentClusterSchedulingType> CONSTANTS = new HashMap<String, AgentClusterSchedulingType>();
    private final static Map<Integer, AgentClusterSchedulingType> INTCONSTANTS = new HashMap<Integer, AgentClusterSchedulingType>();

    static {
        for (AgentClusterSchedulingType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (AgentClusterSchedulingType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private AgentClusterSchedulingType(Integer intValue) {
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return this.name();
    }

    @JsonValue
    public String value() {
        return this.name();
    }

    public Integer intValue() {
        return this.intValue;
    }

    @JsonCreator
    public static AgentClusterSchedulingType fromValue(String value) {
        AgentClusterSchedulingType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static AgentClusterSchedulingType fromValue(Integer intValue) {
        AgentClusterSchedulingType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
