package com.pkr.java.concepts;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		String text = "I,am,a,boy";
		String[] words = text.split(",");
		System.out.println(Arrays.asList(words).size());
	}

}
