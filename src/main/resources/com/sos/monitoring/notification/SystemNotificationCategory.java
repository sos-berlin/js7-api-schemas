package com.sos.monitoring.notification;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SystemNotificationCategory {

    JOC(0), SYSTEM(1);

    private final Integer intValue;
    private final static Map<String, SystemNotificationCategory> CONSTANTS = new HashMap<String, SystemNotificationCategory>();
    private final static Map<Integer, SystemNotificationCategory> INTCONSTANTS = new HashMap<Integer, SystemNotificationCategory>();

    static {
        for (SystemNotificationCategory c : values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (SystemNotificationCategory c : values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private SystemNotificationCategory(Integer intValue) {
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
    public static SystemNotificationCategory fromValue(String value) {
        SystemNotificationCategory constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static SystemNotificationCategory fromValue(Integer intValue) {
        SystemNotificationCategory constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }
}
