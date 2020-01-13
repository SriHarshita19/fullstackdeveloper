package com.cts.map;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapDemo {
public static void main(String args[])
{
	TreeMap<String,Integer>map=new TreeMap<String,Integer>();
	map.put("java", 8000);
	map.put("android",10000);
	map.put("c",3000);
	map.put("angular",20000);
	map.put("java",12000);
	System.out.println(map);
	System.out.println(map.get("java"));
	System.out.println(map.containsValue(10000));
	System.out.println(map.containsKey("c"));
	map.replace("c", 3000,5000);
	System.out.println(map);
	//Set<Entry<String,Integer>>entries=map.entrySet();
	for(Map.Entry<String,Integer>entry:map.entrySet())
	{
		System.out.println(entry.getKey()+"--->"+entry.getValue());
	}
}
}
