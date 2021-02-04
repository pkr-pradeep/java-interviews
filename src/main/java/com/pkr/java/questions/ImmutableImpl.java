package com.pkr.java.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableImpl {
	public static void main(String[] args) {
		List<Integer> listOfInts = new ArrayList<>();
		listOfInts = Arrays.asList(new Integer[]{1,2,3,4,5});
		String className = "ImmutableImpl";
		ImmutableClass imClass = new ImmutableClass(className, listOfInts);
		//listOfInts.add(6);
		System.out.println(imClass.toString());
	}
}