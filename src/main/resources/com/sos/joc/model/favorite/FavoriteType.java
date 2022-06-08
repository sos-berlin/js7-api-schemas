
package com.sos.joc.model.favorite;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FavoriteType {

    FACET(1),
    AGENT(2);
    private final Integer intValue;
    private final static Map<String, FavoriteType> CONSTANTS = new HashMap<String, FavoriteType>();
    private final static Map<Integer, FavoriteType> INTCONSTANTS = new HashMap<Integer, FavoriteType>();

    static {
        for (FavoriteType c: values()) {
            CONSTANTS.put(c.name(), c);
        }
    }

    static {
        for (FavoriteType c: values()) {
            INTCONSTANTS.put(c.intValue, c);
        }
    }

    private FavoriteType(Integer intValue) {
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
    public static FavoriteType fromValue(String value) {
        FavoriteType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

    public static FavoriteType fromValue(Integer intValue) {
        FavoriteType constant = INTCONSTANTS.get(intValue);
        if (constant == null) {
            throw new IllegalArgumentException(intValue + "");
        } else {
            return constant;
        }
    }

}
