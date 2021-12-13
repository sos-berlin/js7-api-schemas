
package com.sos.joc.model.agent;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SubagentDirectorType {

    NO_DIRECTOR(0),
    PRIMARY_DIRECTOR(1),
    SECONDARY_DIRECTOR(2);
    private final Integer intValue;
    private final static Map<String, SubagentDirectorType> CONSTANTS = new HashMap<String, SubagentDirectorType>();
    private final static Map<Integer, SubagentDirectorType> INTCONSTANTS = new HashMap<Integer, SubagentDirectorType>();

    static {
        for (SubagentDirectorType c: values()) {
            CONSTANTS.put(c.name(), c);
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private SubagentDirectorType(Integer intValue) {
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
    public static SubagentDirectorType fromValue(String value) {
        SubagentDirectorType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static SubagentDirectorType fromValue(Integer intValue) {
        SubagentDirectorType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
