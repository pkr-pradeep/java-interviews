package com.pkr.java.questions.override_overload;

public class OverrideMain_0 {

	public static void main(String[] args) {
		System.out.println("OverrideMainMethod");
	}
	
	public void add() {
		
	}
	
    public static void subtract() {
    	System.out.println("static methods cannot be overriden, because they are not dispatched at the instance creation");
	}
}