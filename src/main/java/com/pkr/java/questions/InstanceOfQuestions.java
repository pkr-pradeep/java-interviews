package com.pkr.java.questions;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfQuestions {

	public static void main(String[] args) {
		doCheckInstanceOf();
		doCheckListForInstanceOf();
	}

	/**
	 * For "int","char", "byte", "float",
	 * "boolean", "byte", "short", "float", "double" means 
	 * for all primitive types it will throw exception if we use instance of.
	 * Use wrapper classes such as Integer, Short etc.
	 */
	private static void doCheckInstanceOf() {
		String str = "Hello";
		Integer intr = 5;
		Character charc = 'a';
		Boolean bool = true;
		System.out.println(str instanceof String); //true
		System.out.println(intr instanceof Integer); //true
		System.out.println(charc instanceof Character); //true
		System.out.println(bool instanceof Boolean); //true
	}
	
	/**
	 * Arbitrary elements list to check
	 */
	private static void doCheckListForInstanceOf() {
		List list =  new ArrayList();
		list.add(2);
		list.add("abc");
		System.out.println(list.get(0) instanceof Integer);
		System.out.println(list.get(1) instanceof String);
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Object);
	}

}
