
package com.sos.joc.model.dailyplan;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DailyPlanOrderStateText {

    PLANNED(0),
    SUBMITTED(1),
    FINISHED(8);
    private final Integer intValue;
    private final static Map<String, DailyPlanOrderStateText> CONSTANTS = new HashMap<String, DailyPlanOrderStateText>();
    private final static Map<Integer, DailyPlanOrderStateText> INTCONSTANTS = new HashMap<Integer, DailyPlanOrderStateText>();

    static {
        for (DailyPlanOrderStateText c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (DailyPlanOrderStateText c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private DailyPlanOrderStateText(Integer intValue) {
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
    public static DailyPlanOrderStateText fromValue(String value) {
        DailyPlanOrderStateText constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static DailyPlanOrderStateText fromValue(Integer intValue) {
        DailyPlanOrderStateText constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }
}
