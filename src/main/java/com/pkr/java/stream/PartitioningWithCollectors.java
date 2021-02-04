package com.pkr.java.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class PartitioningWithCollectors {
  static List<Employee_99> employeeList = Arrays.asList(new Employee_99("Tom Jones", 45),
      new Employee_99("Harry Major", 26),
      new Employee_99("Ethan Hardy", 65),
      new Employee_99("Nancy Smith", 22),
      new Employee_99("Catherine Jones", 21),
      new Employee_99("James Elliot", 58),
      new Employee_99("Frank Anthony", 55),
      new Employee_99("Michael Reeves", 40));
 
  public static void main(String args[]){
    Map<Boolean,List<Employee_99>> employeeMap
        = employeeList
          .stream()
          .collect(Collectors.partitioningBy((Predicate<? super Employee_99>) (Employee_99 emp) -> emp.getAge() > 30));
    System.out.println("Employees partitioned based on Predicate - 'age > 30'");
    employeeMap.forEach((Boolean key, List<Employee_99> empList) -> System.out.println(key +"->" + empList));
  }
}
//Employee.java(POJO Class)
class Employee_99 {
  private String name;
  private Integer age;
 
  public Employee_99(String name, Integer age) {
    this.name = name;
    this.age = age;
  }
 
  public int getAge() {
	return age;
}

//Getters and Setters of name & age go here
  public String toString(){
    return "Employee Name:"+this.name
        +"  Age:"+this.age;
  }
 
  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof Employee_99)) {
      return false;
    }
    Employee_99 empObj = (Employee_99) obj;
    return this.age == empObj.age
        && this.name.equalsIgnoreCase(empObj.name);
  }
 
  @Override
  public int hashCode() {
    int hash = 1;
    hash = hash * 17 + this.name.hashCode();
    hash = hash * 31 + this.age;
    return hash;
  }
}
