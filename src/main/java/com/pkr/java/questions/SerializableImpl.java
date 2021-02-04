package com.pkr.java.questions;
// Java program to illustrate Serializable interface 
import java.io.*; 

// By implementing Serializable interface 
// we make sure that state of instances of class A 
// can be saved in a file. 
class Serialize_A implements Serializable 
{ 
	int i; 
	String s; 

	// A class constructor 
	public Serialize_A(int i,String s) 
	{ 
		this.i = i; 
		this.s = s; 
	} 
} 

public class SerializableImpl 
{ 
	public static void main(String[] args) 
	throws IOException, ClassNotFoundException 
	{ 
		Serialize_A a = new Serialize_A(20,"GeeksForGeeks"); 

		// Serializing 'a' 
		FileOutputStream fos = new FileOutputStream("xyz.txt"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(a); 

		// De-serializing 'a' 
		FileInputStream fis = new FileInputStream("xyz.txt"); 
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Serialize_A b = (Serialize_A)ois.readObject();//down-casting object 
		
		Serialize_A c = (Serialize_A)ois.readObject();//down-casting object 

		System.out.println(b.i+" "+b.s); 

		// closing streams 
		oos.close(); 
		ois.close(); 
	} 
} 
