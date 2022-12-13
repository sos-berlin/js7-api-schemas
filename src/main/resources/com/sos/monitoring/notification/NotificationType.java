package com.sos.monitoring.notification;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NotificationType {

    SUCCESS(0), ERROR(1), WARNING(2), RECOVERED(3), ACKNOWLEDGED(4);

    private final Integer intValue;
    private final static Map<String, NotificationType> CONSTANTS = new HashMap<String, NotificationType>();
    private final static Map<Integer, NotificationType> INTCONSTANTS = new HashMap<Integer, NotificationType>();

    static {
        for (NotificationType c : values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (NotificationType c : values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private NotificationType(Integer intValue) {
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
    public static NotificationType fromValue(String value) {
        NotificationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static NotificationType fromValue(Integer intValue) {
        NotificationType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }
}
