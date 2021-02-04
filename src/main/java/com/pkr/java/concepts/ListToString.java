package com.pkr.java.concepts;

import java.util.Arrays;
import java.util.List;

public class ListToString {

	public static void main(String[] args) {
		String[] clients = {"a"};
		List<String> cls = Arrays.asList(clients);
		String joined = String.join(",", cls);
		System.out.println(joined);
	}

}
