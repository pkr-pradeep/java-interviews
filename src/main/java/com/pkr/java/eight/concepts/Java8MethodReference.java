package com.pkr.java.eight.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8MethodReference {

   public static void main(String args[]) {
      List<String> names = new ArrayList<>();
		
      names.add("Mahesh");
      names.add("Suresh");
      names.add("Ramesh");
      names.add("Naresh");
      names.add("Kalpesh");
		
      names.forEach(System.out::println);
      
      List<Integer> integers = Arrays.asList(1,12,433,5);
      Optional<Integer> max = integers.stream().reduce( Math::max ); 
      max.ifPresent( System.out::println );
      Integer[] ints = new Integer[] {1,2,3,4};
      Arrays.asList(ints).stream().forEach(MethodReferenceClass::isEven);
      Arrays.asList(ints).stream().forEach(new MethodReferenceClass()::add);
   }
}

final class MethodReferenceClass {
	
	public static boolean isEven(int x) {
		if(x % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public int add(int x) {
		return x;
	}
}