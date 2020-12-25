package com.pkr.java.questions;

public class JavaCodilityTest {

	public static void main(String[] args) {
		System.out.println(insertFive());
		returnOccurrence();
	}
	
	//all 'a' occurrences must come before 'b'
	//aabb -> true
	//aabbaa -> false
	//aa -> true as no 'b' is there
	//bb -> true as no 'a' is there
	public static void returnOccurrence() {
		String abc = "aa";
		int indexOfA = abc.lastIndexOf('a');
		int indexOfB = abc.indexOf('b', 0);
		if(indexOfA == -1 || indexOfB == -1 || indexOfA < indexOfB) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	//insert 5 at its most suited place
	//5 must be appended before the number which is lesser or equals to it
	// given number
	//123 -> print(5123)
	//643 -> print(6543)
	//-99 -> print(-599)
	//6734 -> print(67534)
	public static int insertFive() {
		int n = -654;
		String number = String.valueOf(n);
		if(n < 0) {
			int power = String.valueOf(Math.abs(n)).length();
			return -1 * (int) (5*Math.pow(10, power) + Math.abs(Integer.valueOf(number)));
		}
		char[] digits = number.toCharArray();
		int i = 0, index = -1;
		for(int j = 0 ;j < digits.length; j++) {
			i = digits[j] - '0';
			if(i <= 5) {
				index = j;
				System.out.println(index);
				break;
			}
		}
		return buildString(index, number);
	}

	//6471 1
	private static int buildString(int index, String number) {
		if(index == 0) {
			return Integer.valueOf("5"+number);
		} else if(index == -1){
			return Integer.valueOf(number+"5");
		} else {
			String sub1 = number.substring(0,index);
			String sub2 = number.substring(index, number.length());
			return Integer.valueOf(sub1+"5"+sub2);
		}
	}
}