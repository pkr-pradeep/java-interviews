package com.pkr.java.stream;

public class EmployeeDetailRegister {
	
	private String name;
	//private int employeeId;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public int getEmployeeId() { return employeeId; } public void
	 * setEmployeeId(int employeeId) { this.employeeId = employeeId; }
	 */
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetailRegister [name=" + name + ", age=" + age + "]";
	}
}
