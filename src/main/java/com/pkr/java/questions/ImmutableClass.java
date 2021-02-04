package com.pkr.java.questions;

import java.util.Collections;
import java.util.List;

public final class ImmutableClass {
  
	private final String className;
	
	private final List<Integer> storeInts;
	
	public ImmutableClass(String className, List<Integer> storeInts) {
		this.className = className;
		this.storeInts = Collections.unmodifiableList(storeInts);
	}

	@Override
	public String toString() {
		return "ImmutableClass [className=" + className + ", storeInts=" + storeInts + "]";
	}
}