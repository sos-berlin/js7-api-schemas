
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ArgumentType {

    STRING(0),
    INTEGER(1),
    NUMBER(2),
    BOOLEAN(3);
    private final Integer intValue;
    private final static Map<String, ArgumentType> CONSTANTS = new HashMap<String, ArgumentType>();
    private final static Map<Integer, ArgumentType> INTCONSTANTS = new HashMap<Integer, ArgumentType>();

    static {
        for (ArgumentType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (ArgumentType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private ArgumentType(Integer intValue) {
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
    public static ArgumentType fromValue(String value) {
        ArgumentType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static ArgumentType fromValue(Integer intValue) {
        ArgumentType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
