
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JobReturnCodeMeaning {

    SUCCESS(0),
    FAILURE(1);
    private final Integer intValue;
    private final static Map<String, JobReturnCodeMeaning> CONSTANTS = new HashMap<String, JobReturnCodeMeaning>();
    private final static Map<Integer, JobReturnCodeMeaning> INTCONSTANTS = new HashMap<Integer, JobReturnCodeMeaning>();

    static {
        for (JobReturnCodeMeaning c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (JobReturnCodeMeaning c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private JobReturnCodeMeaning(Integer intValue) {
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
    public static JobReturnCodeMeaning fromValue(String value) {
        JobReturnCodeMeaning constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static JobReturnCodeMeaning fromValue(Integer intValue) {
        JobReturnCodeMeaning constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
