package com.pkr.java.questions.override_overload;
public class OverrideMain_1 extends OverrideMain_0{
	
	public static void main(String[] args) {
		System.out.println("game over");
	}
	
	@Override
    public void add() {
		System.out.println("Non static method can be overridden");
	}
	
	public static void subtract() {
		System.out.println("static methods cannot be overriden, because they are not dispatched at the instance creation");
	}
	
	public static void subtract(int a) {
		System.out.println("static methods can be overloaded");
	}
}