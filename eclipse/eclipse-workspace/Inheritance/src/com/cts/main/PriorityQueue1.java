package com.cts.main;
import java.util.*;
import java.util.PriorityQueue;

public class PriorityQueue1 {
public static void main(String args[])
{
	PriorityQueue<Integer> queue = new PriorityQueue(); 
    queue.add(12); 
    queue.add(43); 
    queue.add(30); 
    System.out.println(queue.poll());
    System.out.println(queue.peek()); 
}
}
