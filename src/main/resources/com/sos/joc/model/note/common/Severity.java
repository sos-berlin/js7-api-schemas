
package com.sos.joc.model.note.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Severity {

    INFO(0),
    LOW(10),
    NORMAL(20),
    HIGH(30),
    CRITICAL(40);
    private final Integer intValue;
    private final static Map<String, Severity> CONSTANTS = new HashMap<String, Severity>();
    private final static Map<Integer, Severity> INTCONSTANTS = new HashMap<Integer, Severity>();

    static {
        for (Severity c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (Severity c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private Severity(Integer intValue) {
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
    public static Severity fromValue(String value) {
        Severity constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static Severity fromValue(Integer intValue) {
        Severity constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }
    
    public static Severity fromValueOrNull(Integer intValue) {
        if (intValue != null) {
            try {
                return Severity.fromValue(intValue);
            } catch (Exception e) {
            }
        }
        return null;
    }

}
