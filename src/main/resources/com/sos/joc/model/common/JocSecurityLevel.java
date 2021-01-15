package com.sos.joc.model.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JocSecurityLevel {

    LOW(0),
    MEDIUM(1),
    HIGH(2);
    private final Integer intValue;
    private final static Map<String, JocSecurityLevel> CONSTANTS = new HashMap<String, JocSecurityLevel>();
    private final static Map<Integer, JocSecurityLevel> INTCONSTANTS = new HashMap<Integer, JocSecurityLevel>();

    static {
        for (JocSecurityLevel c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (JocSecurityLevel c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private JocSecurityLevel(Integer intValue) {
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
    public static JocSecurityLevel fromValue(String value) {
        JocSecurityLevel constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static JocSecurityLevel fromValue(Integer intValue) {
        JocSecurityLevel constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}