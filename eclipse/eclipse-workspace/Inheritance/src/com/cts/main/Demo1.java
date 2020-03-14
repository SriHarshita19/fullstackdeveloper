package com.cts.main;

public class Demo5 {
public static void main(String args[])
{
	Test2 t=new Test2()
	{
		@Override
		public void show()
		{
			System.out.println("good mrg");
		}
	};
	t.show();
}
}
interface Test2
{
	void show();
}
class Demo5 implements Test2{
	public void show()
	{
		System.out.println("hello");
}
}