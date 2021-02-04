package com.pkr.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class StreamListOperation {

	public static void main(String[] args) {
		List<EmployeeDetailRegister> emRegisters = new ArrayList<EmployeeDetailRegister>();
		emRegisters = loadEmployeeData(emRegisters);
		System.out.println(emRegisters.stream().collect(Collectors.groupingBy((EmployeeDetailRegister edr) -> edr.getAge() > 30)));
		System.out.println(emRegisters.stream().collect(Collectors.partitioningBy((EmployeeDetailRegister edr) -> edr.getAge() > 30, Collectors.counting())));
		System.out.println(emRegisters.stream().collect(Collectors.groupingBy((EmployeeDetailRegister edr) -> edr.getAge(), Collectors.counting())));
		//emRegisters.stream().collect(collector)
	}
	
	public static List<EmployeeDetailRegister> loadEmployeeData(final List<EmployeeDetailRegister> list) {
		for(int i=0; i<10;i++) {
			EmployeeDetailRegister detailRegister = new EmployeeDetailRegister();
			detailRegister.setName("e"+i);
			detailRegister.setAge(ThreadLocalRandom.current().nextInt(25, 40));
			list.add(detailRegister);
		}
		return list;
	}
}