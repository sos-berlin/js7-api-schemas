package com.sos.joc.model.reporting;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Frequency {

    WEEKLY("weekly", 1),
    TWO_WEEKS("every2weeks", 2),
    MONTHLY("monthly", 4),
    THREE_MONTHS("every3months", 13),
    SIX_MONTHS("every6months", 26),
    YEARLY("yearly", 52),
    THREE_YEARS("every3years", 156);
    
    private final String strValue;
    private final Integer intValue;
    private final static Map<String, Frequency> CONSTANTS = new HashMap<String, Frequency>();
    private final static Map<String, Frequency> STRCONSTANTS = new HashMap<String, Frequency>();
    private final static Map<Integer, Frequency> INTCONSTANTS = new HashMap<Integer, Frequency>();

    static {
        for (Frequency c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (Frequency c: values()) {
            STRCONSTANTS.put(c.strValue, c);
        }
    }
    
    static {
        for (Frequency c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private Frequency(String strValue, Integer intValue) {
        this.strValue = strValue;
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

    public String strValue() {
        return this.strValue;
    }
    
    public Integer intValue() {
        return this.intValue;
    }

    @JsonCreator
    public static Frequency fromValue(String value) {
        Frequency constant = CONSTANTS.get(value);
        if (constant == null) {
            return fromStrValue(value);
        } else {
            return constant;
        }
    }
    
    public static Frequency fromValue(Integer value) {
        Frequency constant = INTCONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value + "");
        } else {
            return constant;
        }
    }
    
    private static Frequency fromStrValue(String value) {
        Frequency constant = STRCONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }
}
