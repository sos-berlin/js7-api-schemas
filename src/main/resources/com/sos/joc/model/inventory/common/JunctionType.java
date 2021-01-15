
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JunctionType {

    AWAIT(0),
    PUBLISH(1);
    private final Integer intValue;
    private final static Map<String, JunctionType> CONSTANTS = new HashMap<String, JunctionType>();
    private final static Map<Integer, JunctionType> INTCONSTANTS = new HashMap<Integer, JunctionType>();

    static {
        for (JunctionType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (JunctionType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private JunctionType(Integer intValue) {
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
    public static JunctionType fromValue(String value) {
        JunctionType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static JunctionType fromValue(Integer intValue) {
        JunctionType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
