package com.pkr.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

	public static void main(String[] args) {
		// stream from individual objects
		Stream<Employee> streamFromIndvidualObject = Stream.of(new Employee(1, "Pradeep"), new Employee(2, "Munna"));
		Integer[] intArray = {1,2,3,4,5,6};
		List<Integer> intList = Arrays.asList(intArray);
		//Creating stream from integer list
		Stream<Integer> stream = intList.stream();
		//filtering stream if it has Munna as employee name
		System.out.println(streamFromIndvidualObject.filter(x -> x.getEmployeeName().equals("Munna")).toArray().length);	
		//summation of all even numbers in the list above
		System.out.println(stream.filter(x -> x % 2 == 0).mapToInt(x -> x.intValue()).sum());
		
		
		String abc = "abhhfddc";
		String[] aaa = abc.split("");
		Map<String, Long> map = Arrays.asList(aaa).stream().collect(Collectors.groupingBy((String x) -> x, Collectors.counting()));
		System.out.println(map);
		
	}
	
	

}
