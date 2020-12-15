package com.pkr.java.questions;

public class MinMaxValue {

	public static void main(String[] args) {
		getMinMaxValue();
		doCompareMax();
		doCompareMin();
	}
	
	private static void doCompareMax() {
		System.out.println(Math.max(Double.MAX_VALUE, Float.MAX_VALUE));
		System.out.println(Math.max(Float.MAX_VALUE, Long.MAX_VALUE));
		System.out.println(Math.max(Long.MAX_VALUE, Integer.MAX_VALUE));
		System.out.println(Math.max(Short.MAX_VALUE, Integer.MAX_VALUE));
		System.out.println(Math.max(Short.MAX_VALUE, Byte.MAX_VALUE));
	}
	
	private static void getMinMaxValue() {
		System.out.println("Integer min:"+Integer.MIN_VALUE+ ", max:"+Integer.MAX_VALUE);
		System.out.println("Double min:"+Double.MIN_VALUE+ ", max:"+Double.MAX_VALUE);
		System.out.println("Long min:"+Long.MIN_VALUE+ ", max:"+Long.MAX_VALUE);
		System.out.println("Short min:"+Short.MIN_VALUE+ ", max:"+Short.MAX_VALUE);
		System.out.println("Float min:"+Float.MIN_VALUE+ ", max:"+Float.MAX_VALUE);
		System.out.println("Byte min:"+Byte.MIN_VALUE+ ", max:"+Byte.MAX_VALUE);
		System.out.println("Character min:"+Character.MIN_VALUE+ ", max:"+Character.MAX_VALUE);
	}

	private static void doCompareMin() {
		System.out.println(Math.min(Double.MIN_VALUE, Float.MIN_VALUE));
		System.out.println(Math.min(Float.MIN_VALUE, Long.MIN_VALUE));
		System.out.println(Math.min(Long.MIN_VALUE, Integer.MIN_VALUE));
		System.out.println(Math.min(Short.MIN_VALUE, Integer.MIN_VALUE));
		System.out.println(Math.min(Short.MIN_VALUE, Byte.MIN_VALUE));
	}
}
