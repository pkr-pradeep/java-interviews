package com.pkr.java.questions.staticVar;
class StaticClass_A
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
    }
 
    {
        i = i++ + ++i;
    }
}
 
class StaticClass_B extends StaticClass_A
{
    static
    {
        i = --i - i--;
    }
 
    {
        i = ++i + i++;
    }
}
 
public class StaticVarIncreDecre
{
    public static void main(String[] args)
    {
    	StaticClass_B b = new StaticClass_B();
        System.out.println(b.i);
    }
}