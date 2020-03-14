package com.cts.training.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Example {
public static void main(String args[]) throws IOException
{
//	FileInputStream fin=new FileInputStream("details.properties");
//	Properties properties=new Properties();
//	properties.load(fin);
//	System.out.println("Server"+properties.getProperty("server"));
//	System.out.println("port"+properties.getProperty("port"));
//	System.out.println("username"+properties.getProperty("username"));
//	System.out.println("password"+properties.getProperty("password"));
	Properties p=System.getProperties();
	Set<Entry<Object,Object>>set=p.entrySet();
	for(Map.Entry<Object, Object>entry:set) {
		System.out.println(entry.getKey()+""+entry.getValue());
}
}
	

}