
package com.sos.controller.model.deploy;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DeleteType {

    WORKFLOW("WorkflowPath", 1),
    JOBCLASS("JobClassPath", 2),
    LOCK("LockPath", 4),
    FILEORDERSOURCE("FileWatchPath", 9),
    JOBRESOURCE("JobResourcePath", 10),
    BOARD("BoardPath", 11);
    private final String value;
    private final Integer intValue;
    private final static Map<String, DeleteType> CONSTANTS = new HashMap<String, DeleteType>();
    private final static Map<Integer, DeleteType> INTCONSTANTS = new HashMap<Integer, DeleteType>();

    static {
        for (DeleteType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    static {
        for (DeleteType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DeleteType(String value, Integer intValue) {
        this.value = value;
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    public Integer intValue() {
        return this.intValue;
    }

    @JsonCreator
    public static DeleteType fromValue(String value) {
        DeleteType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static DeleteType fromValue(Integer intValue) {
        DeleteType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
