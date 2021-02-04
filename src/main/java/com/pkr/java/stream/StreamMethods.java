package com.pkr.java.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

	public static void main(String[] args) {
		StreamMethods stMtd = new StreamMethods();
		stMtd.usingForEach();
		usingMap_1();
		usingCollect();	
		usingFilter();
		usingFindFirst();
		usingMap_2();
		usingMapString();
		usingPeek();
	}

	private static void usingPeek() {
		String[] names = {"Pradeep", "works", "hard"};
		//Arrays.asList(names).stream().filter(x -> x.charAt(0)=='P').peek(System.out::println).count();
		Arrays.asList(names).stream().sorted().forEach(System.out::println);
		//System.out.println(count);
	}

	//Supplier is used because I have used forEach on stream twice
	//which is not possible after forEachOrdered stream is closed
	//further operation cant be done later on.
	//https://www.baeldung.com/java-stream-operated-upon-or-closed-exception
	public void usingForEach() {
		StreamMethods strem = new StreamMethods();
		Supplier<Stream<Integer>> streamSupplier 
		  = () -> Stream.of(1,3,2,4);
		// printing the elements of stream in encounter order
		  streamSupplier.get().forEachOrdered(System.out::println);
		  streamSupplier.get().forEach(strem::subtract);
	}

	public static void usingMap() {
		Stream<Integer> stream = Stream.of(1,3,2,4);
		List<Integer> list = stream.map(x -> x*3).collect(Collectors.toList());
		System.out.println(list);
	}

	public static void usingMap_1() {
		Stream<Integer> stream = Stream.of(1,3,2,4);
		List<Integer> list = stream.map(StreamMethods::add).collect(Collectors.toList());
		System.out.println(list);
	}
	
	public static void usingMapString() {
		Stream<String> stream = Stream.of("Name", "Game", "Shame", "Hen", "Pink");
		//get all those strings with last char as 'e'
		List<String> list = stream.filter(x -> 'e' == x.charAt(x.length()-1)).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(list);
	}
	
	public static void usingMap_2() {
		Map<String, Professions> map = new HashMap<>();
		map.put("Education", new Professions("PKR Studies", 5000, "Youtube"));
		map.put("Arbitrary", new Professions("JackOfAll", 5000, "Youtube"));
		map.put("Twitch", new Professions("OptimusPrime", 5000, "Gaming"));
		map.put("Steam", new Professions("OptimusPrime", 5000, "Gaming"));
		
		List<Professions> list = map.entrySet().stream().filter(x -> x.getValue().getField().equals("Youtube")).map(x -> x.getValue()).collect(Collectors.toList());
		list.stream().forEach(x -> System.out.println(x.getName()+","+x.getField()));
	}
	
	public static void usingCollect() {
		Supplier<Stream<String>> supplierStream = () ->  Stream.of("Pradeep", "Sunita");
		List<String> listOfString = supplierStream.get().collect(Collectors.toList());
		listOfString.forEach(System.out::print);
		Set<String> set = supplierStream.get().collect(Collectors.toSet());
		System.out.println("\nSet:"+set);
		Map<String, String> map =
				supplierStream.get().collect(Collectors.toMap(String::toLowerCase, String::toUpperCase));
		System.out.println("map:"+map);
	}
	
	public static void usingFilter() {
		Supplier<Stream<Integer>> supplierStream = () ->  Stream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,30,36,60);
		List<Integer> numsCanBeDividedBy30 = supplierStream.get().filter(x -> x %2 == 0).filter(x -> x % 3==0).filter(x -> x % 5 == 0).collect(Collectors.toList());
		System.out.println(numsCanBeDividedBy30);
		
	}
	
	public static void usingFindFirst() {
		Supplier<Stream<Integer>> supplierStream = () ->  Stream.of(7,7,4,7);
		int firstNum = supplierStream.get().findFirst().orElse(0);
		System.out.println(firstNum);
	}

	public static int add(int x) {
		if(x == 2) {
			return x;
		}
		x = x+1;
		return x;
	}

	public int subtract(int x) {
		if(x == 2) {
			System.out.println(x);
			return x;
		}
		x = x-1;
		System.out.println(x);
		return x;
	}
}


class Professions {
	String name;
	int noOfFollowers;
	String field;
	public Professions(String name, int noOfFollowers, String field) {
		super();
		this.name = name;
		this.noOfFollowers = noOfFollowers;
		this.field = field;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfFollowers() {
		return noOfFollowers;
	}
	public void setNoOfFollowers(int noOfFollowers) {
		this.noOfFollowers = noOfFollowers;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	
}