package com.cts.main;

public class Student {
 String name;
 void setName(String name)
 {
	 this.name=name;
 }
 
private String getName() {
	// TODO Auto-generated method stub
	return this.name;
}
public static void main(String args[])
 {
	 Student s=new Student();
	 s.setName("Veda");
	 System.out.println("s.name:"+s.getName());
 }
}
