package com.pkr.java.questions;
// JAVA implementation of the above approach 

public class  SumOddPlacesMultiplyEvenPlaces{ 

	// below function checks whether 
	// product of digits at even places 
	// is divisible by sum of digits at odd places 
	static boolean productSumDivisible(String n) 
	{ 
		int sum = 0, product = 1;
		for(int i = 0; i < n.length(); i++) {
			//odd place in mathematics
			if(i%2 ==0) {
				sum += n.charAt(i) - '0';
			} else {
				product*= n.charAt(i) - '0';
			}
		}
		System.out.println(product);
		if (product % sum == 0) { 
			return true; 
		} 
		return false; 
	} 
	// Driver code 

	public static void main(String[] args) 
	{ 
		int n = 123202; 
		String number = Integer.toString(n);

		if (productSumDivisible(number)) { 
			System.out.println("TRUE"); 
		} 
		else { 
			System.out.println("FALSE"); 
		} 
	} 
} 
