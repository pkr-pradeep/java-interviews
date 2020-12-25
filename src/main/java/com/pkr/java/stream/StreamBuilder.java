package com.pkr.java.stream;

import java.util.stream.Stream;

public class StreamBuilder {

	public static void main(String[] args) {
		Stream.Builder<Employee> streamBuilder = Stream.builder();
		streamBuilder.accept(new Employee(1, "Pradeep"));
		streamBuilder.accept(new Employee(2, "Munna"));
		
		Stream<Employee> stream = streamBuilder.build();
		stream.forEach(System.out::println);
	}

}
