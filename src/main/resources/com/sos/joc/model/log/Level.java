
package com.sos.joc.model.log;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Level {

    FATAL(0),
    ERROR(1),
    WARN(2),
    INFO(3),
    DEBUG(4),
    TRACE(5);
    private final Integer intValue;
    private final static Map<String, Level> CONSTANTS = new HashMap<>();
    private final static Map<Integer, Level> INTCONSTANTS = new HashMap<>();

    static {
        for (Level c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (Level c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private Level(Integer intValue) {
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
    public static Level fromValue(String value) {
        Level constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static Level fromValue(Integer intValue) {
        Level constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
