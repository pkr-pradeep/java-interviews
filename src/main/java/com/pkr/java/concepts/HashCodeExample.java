package com.pkr.java.concepts;

public class HashCodeExample {

	public static void main(String[] args) {
		Long a = 2564566L;
		Integer b = 234;
		Float f = 234.3f;
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(f.hashCode());
	}

}
