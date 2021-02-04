package com.pkr.java.eight.concepts;
public class Java8lambdaExpression {

   public static void main(String args[]) {
	   Java8lambdaExpression tester = new Java8lambdaExpression();
		
      //with type declaration
      MathOperation addition = (int a, int b) -> a + b;
		
      //with out type declaration
      MathOperation subtraction = (a, b) -> a - b;
		
      //with return statement along with curly braces
      MathOperation multiplication = (int a, int b) -> { return a * b; };
		
      //without return statement and without curly braces
      MathOperation division = (int a, int b) -> a / b;
		
      System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
      System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
      System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
      System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
      //without parenthesis
      GreetingService greetService1 = message ->
      System.out.println("Hello " + message);
		
      //with parenthesis
      GreetingService greetService2 = (message) ->
      System.out.println("Hello " + message);
		
      greetService1.sayMessage("Mahesh");
      greetService2.sayMessage("Suresh");
      
      //poly expression concept lambda expression
      PolyInterfaceInteger interfaceInteger = (x,y) -> x + y;
      PolyInterfaceString interfaceString = (x,y) -> x + y;
      System.out.println(interfaceInteger.add(5, 6));
      System.out.println(interfaceString.concatStr("a", "b"));
      
      //Generics Functional Interface
      GenericsInterface<String, Integer> genericsInterface = (x) -> Integer.toString(x + x);
      System.out.println(genericsInterface.concatStr(2));
   }
	
   interface MathOperation {
      int operation(int a, int b);
   }
	
   interface GreetingService {
      void sayMessage(String message);
   }
   
   interface PolyInterfaceInteger {
	   int add(int x, int y);
   }
   
   interface PolyInterfaceString {
	   String concatStr(String a, String b);
   }
   
   interface GenericsInterface<U, T> {
	   U concatStr(T u);
   }
	
   private int operate(int a, int b, MathOperation mathOperation) {
      return mathOperation.operation(a, b);
   }
}