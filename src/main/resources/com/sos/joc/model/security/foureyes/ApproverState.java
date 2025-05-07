
package com.sos.joc.model.security.foureyes;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ApproverState {

    OPEN(0),
    APPROVED(1),
    REJECTED(2);
    private final Integer intValue;
    private final static Map<String, ApproverState> CONSTANTS = new HashMap<String, ApproverState>();
    private final static Map<Integer, ApproverState> INTCONSTANTS = new HashMap<Integer, ApproverState>();

    static {
        for (ApproverState c: values()) {
            CONSTANTS.put(c.name(), c);
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private ApproverState(Integer intValue) {
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
    public static ApproverState fromValue(String value) {
        ApproverState constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static ApproverState fromValue(Integer intValue) {
        ApproverState constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
