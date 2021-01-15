
package com.sos.joc.model.order;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderStateText {

    PLANNED(0),
    PENDING(1),
    RUNNING(2),
    SUSPENDED(3),
    FAILED(4),
    WAITING(5),
    BLOCKED(6),
    CANCELLED(7),
    FINISHED(8),
    RESUMED(9),
    SUSPENDMARKED(10),
    RESUMEMARKED(11),
    BROKEN(12),
    INPROGRESS(13),
    UNKNOWN(99);
    private final Integer intValue;
    private final static Map<String, OrderStateText> CONSTANTS = new HashMap<String, OrderStateText>();
    private final static Map<Integer, OrderStateText> INTCONSTANTS = new HashMap<Integer, OrderStateText>();

    static {
        for (OrderStateText c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (OrderStateText c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private OrderStateText(Integer intValue) {
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
    public static OrderStateText fromValue(String value) {
        OrderStateText constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static OrderStateText fromValue(Integer intValue) {
        OrderStateText constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }
}
