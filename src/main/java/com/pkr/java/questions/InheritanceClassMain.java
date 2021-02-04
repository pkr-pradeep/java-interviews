package com.pkr.java.questions;

public class InheritanceClassMain {
	public static void main(String[] args) {
		ConcreteClass_1 conc_1 = new InheritanceImpl_1();
		System.out.println(conc_1.getName());//Java Third rule //concrete class method > interface default method
		//child class object but cannot call child class methods
		((InheritanceImpl_1)conc_1).getClassNm(); //Cast into child class
		
		
		InheritanceImpl_1 impl_1 =  new InheritanceImpl_1();
		((ConcreteClass_1)impl_1).getName();
	}
}

class InheritanceImpl_1 extends ConcreteClass_1 implements Inteface_1{

	@Override
	public void getIndentity() {
		System.out.println("InheritanceImpl");
	}
	
	public void getClassNm() {
		System.out.println("InheritanceImpl method2");
	}
	
	public String getName() {
		return "InheritanceImpl_1";
	}
}


interface Inteface_1 {
	public void getIndentity();
	
	default String getName() {
		return "Inteface_1";
	}
}

class ConcreteClass_1 {
	public String getName() {
		return "ConcreteClass_1";
	}
}