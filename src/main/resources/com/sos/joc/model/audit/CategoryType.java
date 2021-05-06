
package com.sos.joc.model.audit;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CategoryType {

    ADMINSTRATION(1),
    CONTROLLER(2),
    INVENTORY(3),
    DEPLOYMENT(4),
    DAILYPLAN(5),
    FILETRANSFER(6),
    NOTIFICATION(7),
    OTHERS(8),
    DOCUMENTATIONS(9),
    CERTIFICATES(10);
    private final Integer intValue;
    private final static Map<String, CategoryType> CONSTANTS = new HashMap<String, CategoryType>();
    private final static Map<Integer, CategoryType> INTCONSTANTS = new HashMap<Integer, CategoryType>();

    static {
        for (CategoryType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (CategoryType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private CategoryType(Integer intValue) {
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
    public static CategoryType fromValue(String value) {
        CategoryType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static CategoryType fromValue(Integer intValue) {
        CategoryType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
