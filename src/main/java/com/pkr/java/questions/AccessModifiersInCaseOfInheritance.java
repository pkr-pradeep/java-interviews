package com.pkr.java.questions;
class A {
   protected void protectedMethod() {
      System.out.println("superclass protected method");
   }
}
class B extends A {
   protected void protectedMethod() {
      System.out.println("subclass protected method");
   }
}
//Here you cannot reduce visibility in child class methods 
public class AccessModifiersInCaseOfInheritance {
   public static void main(String args[]) {
      B b = new B();
      b.protectedMethod();
   }
}