package com.cts.main;
class Fruit{
	
}
class Apple extends Fruit{
	
}
public class instanceOf {
public static void main(String args[]) {
	Apple a=new Apple();
	System.out.println("is a an instance of fruit:"+(a instanceof Fruit));
}
	
}
