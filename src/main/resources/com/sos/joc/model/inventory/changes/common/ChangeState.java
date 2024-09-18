
package com.sos.joc.model.inventory.changes.common;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ChangeState {

    OPEN(0),
    CLOSED(1),
    PUBLISHED(2);
    private final Integer intValue;
    private final static Map<String, ChangeState> CONSTANTS = new HashMap<String, ChangeState>();
    private final static Map<Integer, ChangeState> INTCONSTANTS = new HashMap<Integer, ChangeState>();

    static {
        for (ChangeState c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (ChangeState c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private ChangeState(Integer value) {
        this.intValue = value;
    }

    @Override
    public String toString() {
        return this.name();
    }

    public Integer intValue() {
        return this.intValue;
    }

    @JsonValue
    public String value() {
        return this.name();
    }

    @JsonCreator
    public static ChangeState fromValue(String value) {
        ChangeState constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static ChangeState fromValue(Integer intValue) {
        ChangeState constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
