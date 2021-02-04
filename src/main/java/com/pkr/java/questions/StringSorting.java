package com.pkr.java.questions;

import java.util.Arrays;

public class StringSorting {
	public static void main(String[] args) {
		String str = "pradeeprout";
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
		String a = new String("a");
		
	}
	
	public void changeString(String str) {
	 str = new String("b");
	}
}
