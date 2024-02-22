
package com.sos.joc.model.reporting;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReportRunStateText {

    SUCCESSFUL(0),
    FAILED(1),
    IN_PROGRESS(2),
    UNKNOWN(3);
    private final Integer intValue;
    private final static Map<String, ReportRunStateText> CONSTANTS = new HashMap<String, ReportRunStateText>();
    private final static Map<Integer, ReportRunStateText> INTCONSTANTS = new HashMap<Integer, ReportRunStateText>();

    static {
        for (ReportRunStateText c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (ReportRunStateText c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private ReportRunStateText(Integer intValue) {
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
    public static ReportRunStateText fromValue(String value) {
        ReportRunStateText constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static ReportRunStateText fromValue(Integer intValue) {
        ReportRunStateText constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
