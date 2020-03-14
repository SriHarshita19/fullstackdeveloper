package com.cts.activity.training.thread;

public class ThreadCreation {
public static void main(String args[]) {
	
	Resource resource=new Resource();
	FirstThread firstThread=new FirstThread();
	SecondThread secondThread=new SecondThread();
	Thread threadOne=new Thread(firstThread);
	Thread threadTwo=new Thread(secondThread);
	threadOne.start();
	threadTwo.start();
	System.out.println("First thread priority:"+threadOne.getPriority());
	System.out.println("Second thread priority:"+threadTwo.getPriority());
}
}
class FirstThread implements Runnable
{
	Resource resource;
	public FirstThread(Resource resource)
	{
		this.resource=resource;
	}
    public FirstThread() {
		// TODO Auto-generated constructor stub
	}
	public void run()
    {
    	resource.display("First Thread");
    }
	
}
//even values
class SecondThread implements Runnable
{
	Resource resource;
	public SecondThread(Resource resource)
	{
		this.resource=resource;
	}
    public SecondThread() {
		// TODO Auto-generated constructor stub
	}
	public void run()
    {
    	resource.display("Second Thread");
    }
}
class Resource
{
	public void display(String message)
	{
		synchronized(this) {
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(message+" "+i);
		}
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
}