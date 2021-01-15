
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReleaseType {

    WORKINGDAYSCALENDAR(60),
    NONWORKINGDAYSCALENDAR(61),
    SCHEDULE(7);
    private final Integer intValue;
    private final static Map<String, ReleaseType> CONSTANTS = new HashMap<String, ReleaseType>();
    private final static Map<Integer, ReleaseType> INTCONSTANTS = new HashMap<Integer, ReleaseType>();

    static {
        for (ReleaseType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (ReleaseType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private ReleaseType(Integer intValue) {
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
    public static ReleaseType fromValue(String value) {
        ReleaseType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static ReleaseType fromValue(Integer intValue) {
        ReleaseType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
