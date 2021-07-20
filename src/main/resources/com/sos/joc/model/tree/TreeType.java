
package com.sos.joc.model.tree;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TreeType {

    INVENTORY(99),
    FOLDER(0),
    WORKFLOW(1),
    JOBCLASS(2),
    LOCK(4),
    SCHEDULE(7),
    JOB(8),
    FILEORDERSOURCE(9),
    JOBRESOURCE(10),
    BOARD(11),
    DOCUMENTATION(20),
    WORKINGDAYSCALENDAR(60),
    NONWORKINGDAYSCALENDAR(61);
    private final Integer intValue;
    private final static Map<String, TreeType> CONSTANTS = new HashMap<String, TreeType>();
    private final static Map<Integer, TreeType> INTCONSTANTS = new HashMap<Integer, TreeType>();

    static {
        for (TreeType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (TreeType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private TreeType(Integer intValue) {
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
    public static TreeType fromValue(String value) {
        TreeType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static TreeType fromValue(Integer intValue) {
        TreeType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
