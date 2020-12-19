package com.pkr.java.questions.staticVar;

public class StaticCallWithNullInstance {
	public static void main(String[] args) {
		StaticMethodClass class1 = null;
		class1.print();
	}
}


class StaticMethodClass {
	
	public static void print() {
		System.out.println("Static method can be called via null reference");
	}
}