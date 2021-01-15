
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum JobCriticality {

    NORMAL(0),
    CRITICAL(1);
    private final Integer intValue;
    private final static Map<String, JobCriticality> CONSTANTS = new HashMap<String, JobCriticality>();
    private final static Map<Integer, JobCriticality> INTCONSTANTS = new HashMap<Integer, JobCriticality>();

    static {
        for (JobCriticality c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (JobCriticality c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private JobCriticality(Integer intValue) {
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
    public static JobCriticality fromValue(String value) {
        JobCriticality constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static JobCriticality fromValue(Integer intValue) {
        JobCriticality constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
