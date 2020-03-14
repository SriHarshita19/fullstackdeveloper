package com.cts.activity.training.lambda;

public class LambdaExpression {
public static void main(String args[])
{
	Hello h=(a,b)->a+b;
	System.out.println(h.add(10, 20));
}
}
@FunctionalInterface
interface Hello{
	
    public int add(int a,int b);
}
