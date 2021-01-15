
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JobLogLevel {

    INFO(0),
    DEBUG(1),
    TRACE(2);
    private final Integer intValue;
    private final static Map<String, JobLogLevel> CONSTANTS = new HashMap<String, JobLogLevel>();
    private final static Map<Integer, JobLogLevel> INTCONSTANTS = new HashMap<Integer, JobLogLevel>();

    static {
        for (JobLogLevel c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (JobLogLevel c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private JobLogLevel(Integer intValue) {
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
    public static JobLogLevel fromValue(String value) {
        JobLogLevel constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static JobLogLevel fromValue(Integer intValue) {
        JobLogLevel constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
