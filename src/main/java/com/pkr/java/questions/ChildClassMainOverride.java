package com.pkr.java.questions;

public class ChildClassMainOverride extends SuperClassMainOverride {
	public static void main(String[] args) {
		System.out.println("child class overriden");
	}
}

class SuperClassMainOverride {
	public static void main(String[] args) {
		System.out.println("Super class overriden");
	}
}