package com.pkr.java.questions.override_overload;

class Derived {
	public void getDetails(String temp) {
		System.out.println("Derived class " + temp);
	}
}

public class ExtendsImplementsDefaultMethod extends Derived implements iTest, iTest1 {
	public void getDetails(String temp) {
		// super.getDetails(temp);
		System.out.println("Test class " + temp);
	}

	@Override 
	public int getInt() {
		System.out.println("implemeting two interfaces having exact default methods"
				+ " can create diamond problem using @override can overcome this situation");
		int j = iTest.super.getInt();
		System.out.println("Above line can be used to call super methods, numbers from super:"+j);
		return 5; 
		
	}

	public static void main(String[] args) {
		ExtendsImplementsDefaultMethod obj = new ExtendsImplementsDefaultMethod();
		obj.getDetails("GFG");

		Derived ob_1 = new ExtendsImplementsDefaultMethod();
		ob_1.getDetails("PKR");
	}
}

interface iTest {
	default int getInt() {
		System.out.println(1);
		return 1;
	}
}

interface iTest1 {
	default int getInt() {
		return 2;
	}
}