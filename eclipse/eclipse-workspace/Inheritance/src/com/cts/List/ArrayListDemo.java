package com.cts.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListDemo {
public static void main(String args[])
{
	ArrayList list=new ArrayList();
	list.add("hello");
	list.add(2020);
	list.add("january");
	list.add(true);
	list.add(1, "1st" );
	list.remove(true);
	System.out.println(list.size());
	System.out.println(list);
	ArrayList names=new ArrayList();
	names.add("sri");
	names.add("sai");
	names.add("divya");
	list.addAll(names);
	System.out.println(list);
	System.out.println(list.contains("Test"));
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		Object obj=itr.next();
		System.out.println(obj);
	}
	for(Object obj:list)
	{
		System.out.println(obj);
	}	
}
}
