
package com.sos.joc.model.log;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Product {

    CONTROLLER(0),
    AGENT(1);
    //JOC(2);
    private final Integer intValue;
    private final static Map<String, Product> CONSTANTS = new HashMap<>();
    private final static Map<Integer, Product> INTCONSTANTS = new HashMap<>();

    static {
        for (Product c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (Product c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private Product(Integer intValue) {
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
    public static Product fromValue(String value) {
        Product constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static Product fromValue(Integer intValue) {
        Product constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
