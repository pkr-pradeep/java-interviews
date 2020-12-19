package com.pkr.java.questions;

public class ClassVariables_1 {

	int i = 10;
	static int j = 2;
	static {
		j += 15;
	}
	
	public ClassVariables_1(int n) {
		this.i = n;
	}
	public void add() {
		i = i + 6;
		System.out.println(i);
	}
	public static void main(String[] args) {
		ClassVariables_1 demo = new ClassVariables_1(1);
		demo.add();
		System.out.println(demo.i);
		increment();
		System.out.println(j);
		demo.methodOfA();
		char b = getAsciiValueOfChars_1();
		int c = getAsciiValueOfChars_1();
		System.out.println(b+" "+c);
	}
	
	private static void increment() {
		j +=10;
	}
	
	//commented line will throw null pointer exception
	//Interger.intValue() will throw null pointer exception
	public int methodOfA()
    {
        //return (true ? null : 0);
		return 0;
    }
	
	public static char getAsciiValueOfChars_1() {
		return 'j' + 'a' + 'v' + 'a';
	}
	
	public static int getAsciiValueOfChars_2() {
		return 'j' + 'a' + 'v' + 'a';
	}
}
