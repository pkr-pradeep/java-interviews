package com.pkr.java.Arrays.asList;

import java.util.Arrays;
import java.util.List;

/**
 * The type of array must be a Wrapper Class(Integer,FLoat, etc) 
 * in case of primitive data types(int,float,etc) , i.e you can’t pass  int a[] but you can pass Integer a[]
 * If you pass int a[],this function will return a  List <int a[]> and not List <Integer>
 * @author pkrpr
 *
 */
public class ArraysAsList {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6};
		List<int[]> listOfIntArray = Arrays.asList(arr);
		Integer[] arrInt = {1,2,3,4,7,6};
		List<Integer> list = Arrays.asList(arrInt);
		System.out.println(listOfIntArray); //[[I@4361bd48]
		System.out.println(list); //[1, 2, 3, 4, 7, 6]
	}

}
