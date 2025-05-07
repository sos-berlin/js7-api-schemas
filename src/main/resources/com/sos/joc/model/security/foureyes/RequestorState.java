
package com.sos.joc.model.security.foureyes;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RequestorState {

    REQUESTED(0),
    WITHDRAWN(1),
    IN_PROGRESS(2),
    SUCCESSFUL(3),
    FAILED(4);
    private final Integer intValue;
    private final static Map<String, RequestorState> CONSTANTS = new HashMap<String, RequestorState>();
    private final static Map<Integer, RequestorState> INTCONSTANTS = new HashMap<Integer, RequestorState>();

    static {
        for (RequesterState c: values()) {
            CONSTANTS.put(c.name(), c);
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private RequestorState(Integer intValue) {
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
    public static RequestorState fromValue(String value) {
        RequesterState constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static RequestorState fromValue(Integer intValue) {
        RequestorState constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
