package com.cts.activity.training.thread;

public class ThreadDemo {
	public static void main(String args[])
	{
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		thread.setName("cts thread");
		System.out.println("Thread Name:"+thread.getName());
		System.out.println("Is thread Daemon?:" +thread.isDaemon());
		System.out.println("Is thread alive?:" +thread.isAlive());
		System.out.println("Thread State:" +thread.getState());
		System.out.println("Thread Id:" +thread.getId());
	}
}
