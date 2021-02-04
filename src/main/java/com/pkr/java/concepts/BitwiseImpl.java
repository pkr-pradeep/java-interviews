package com.pkr.java.concepts;

public class BitwiseImpl {
	public static void main(String[] args) {
		int a = 2; //0010
		System.out.println(a << 1); //001[0] -> 01[0]0
		int b = -2;//get the binary of +2(0010) then complement it(1101) then add 1 to it .....1110 
		System.out.println(b << 1);//[11]10 -> ......11[11] .i.e 
		System.out.println(-3 >> 2);
	}
}
