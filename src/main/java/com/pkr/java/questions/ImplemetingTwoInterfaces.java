package com.pkr.java.questions;

public class ImplemetingTwoInterfaces implements FirstInteface, SecondInteface{
	public static void main(String[] args) {
		System.out.println("implementing two interfaces");
		new ImplemetingTwoInterfaces().getName();
	}

	@Override
	public String getName() {
		return FirstInteface.super.getName();
	}

	@Override
	public void getIndentity() {
		
	}
}

interface FirstInteface {
	public void getIndentity();
	
	default String getName() {
		return "firstI";
	}
}

interface SecondInteface {
	default String getName() {
		return "secondI";
	}
}