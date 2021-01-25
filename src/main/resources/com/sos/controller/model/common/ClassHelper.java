package com.sos.controller.model.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class ClassHelper {
	
	@JsonIgnore
	public <T> T cast(Class<T> clazz) throws ClassCastException {
        return clazz.cast(this);
    }
	
	@SuppressWarnings({ "unchecked" })
	@JsonIgnore
	public <T> T cast() throws ClassCastException {
		return (T) this;
    }
	
	@JsonIgnore
	public <T> Boolean isInstanceOf(Class<T> clazz) throws ClassCastException {
		return clazz.isInstance(this);
    }

}
