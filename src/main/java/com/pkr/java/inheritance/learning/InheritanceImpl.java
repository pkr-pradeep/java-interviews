package com.pkr.java.inheritance.learning;

/**
 * 
 * @author pkrpr
 * Cannot reduce the visibility of the inherited method from SuperClass
 * i.e. display() in child cannot have protected or private if super class has public display()
 * Can call child class method only when superclass variable refers to child class object.
 * i.e. SuperClass obj = new ChildClass(); //type-casting to child class
 * child can override the value if the variable is not defined with same name in child class as a class variable
 * those method methods will be called for child class they can update the super class variable value
 * the updated value will be passed to next method call
 * 
 */
public class InheritanceImpl {
	public static void main(String[] args) {
		SuperClass a = new ChildClass();
		((ChildClass) a).display_1();//5 7 9
		((ChildClass) a).display_2();//5 13 15
		a.display();//5 13 15
	}
}

class SuperClass {
	final int i = 5;
	int k = 9;
	public static int j,l;

	public void display() {
		System.out.println(i+","+j+","+k);
	}
}

class ChildClass extends SuperClass {
	final int i = 8; //no use
	static {
		j = 1;
	}
	public void display_2() {
		j += 6;
		k = k + 6;
		super.display();
	}
	public void display_1() {
		j += 6;
		l = 1;
		super.display();
	}
}