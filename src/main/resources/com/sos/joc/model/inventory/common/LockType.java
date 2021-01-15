
package com.sos.joc.model.inventory.common;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LockType {

    EXCLUSIVE(0),
    SHARED(1),
    QUANTITATIVE_RESOURCES(2);
    private final Integer intValue;
    private final static Map<String, LockType> CONSTANTS = new HashMap<String, LockType>();
    private final static Map<Integer, LockType> INTCONSTANTS = new HashMap<Integer, LockType>();

    static {
        for (LockType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (LockType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private LockType(Integer intValue) {
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
    public static LockType fromValue(String value) {
        LockType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static LockType fromValue(Integer intValue) {
        LockType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
