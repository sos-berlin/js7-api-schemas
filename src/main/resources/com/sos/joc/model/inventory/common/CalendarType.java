
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CalendarType {

    WORKINGDAYSCALENDAR(60),
    NONWORKINGDAYSCALENDAR(61);
    private final Integer intValue;
    private final static Map<String, CalendarType> CONSTANTS = new HashMap<String, CalendarType>();
    private final static Map<Integer, CalendarType> INTCONSTANTS = new HashMap<Integer, CalendarType>();

    static {
        for (CalendarType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (CalendarType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private CalendarType(Integer intValue) {
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
    public static CalendarType fromValue(String value) {
        CalendarType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static CalendarType fromValue(Integer intValue) {
        CalendarType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
