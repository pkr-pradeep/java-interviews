package com.pkr.java.stream;

import java.util.Comparator;
import java.util.stream.Stream;
/**
 * Please use wrapper classes to get correct type List
 * Stream.of(int[]) will given Stream of data type int[] not integer
 * Therefore use Stream.of(Integer[]) to get stream if integers. 
 * example Character, Byte, Short etc.
 * @author pkrpr
 *
 */
public class StreamFromArray {

	public static void main(String[] args) {
		Employee[] employees = {new Employee(1, "pradeep"), new Employee(2, "Munna") };
		Stream.of(employees);
		
		Integer[] arr = {1,2,3,4,7,6};
		boolean value = Stream.of(arr).anyMatch(x -> x == 5);
		System.out.println(value);
	}

}

class Employee implements Comparator<Employee> {
	private int employeeId;
	private String employeeName;
	public Employee(int employeeId, String employeeName) {
		super();
		this.setEmployeeId(employeeId);
		this.setEmployeeName(employeeName);
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	
	
}
