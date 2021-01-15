
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JobType {

    SHELL(0),
    JAVA(1);
    private final Integer intValue;
    private final static Map<String, JobType> CONSTANTS = new HashMap<String, JobType>();
    private final static Map<Integer, JobType> INTCONSTANTS = new HashMap<Integer, JobType>();

    static {
        for (JobType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (JobType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private JobType(Integer intValue) {
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
    public static JobType fromValue(String value) {
        JobType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static JobType fromValue(Integer intValue) {
        JobType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
