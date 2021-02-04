package com.pkr.java.questions;
// Java Program to Count Number of Digits in a String 
public class CountDigitsOrAnySpecificCharInAString { 

	public static void main(String[] args) 
	{ 
		String str = "GeeksforGeeks password is : 01239"; 
		int digits = 0; 
		for (int i = 0; i < str.length(); i++) { 
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) 
				digits++; 
		} 
		System.out.println("Total number of Digits = "
						+ digits); 
		countCapitalG(str);
	}

	private static void countCapitalG(String str) {
		int count_G = 0;
		for (int i = 0; i < str.length(); i++) { 
			if (str.charAt(i) ==71) 
				count_G++; 
		} 
		System.out.println(count_G);
	} 
}
