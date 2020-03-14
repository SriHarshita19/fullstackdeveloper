package com.cts.stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
public static void main(String args[])
{
	List<String> names=new ArrayList<String>();
	addNames(names);
	names.forEach(System.out::println);
	List<String> lengthScale=names.stream().filter(s->s.length()>=6).collect(Collectors.toList());
	System.out.println("The names which has length greater than 6:\n");
	lengthScale.forEach(System.out::println);
	List<String> capNames=names.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	capNames.forEach(System.out::println);
	
}

private static void addNames(List<String> names) {
	// TODO Auto-generated method stub
	names.add("Harshita");
	names.add("Divya");
	names.add("Sindhu");
	names.add("Navya");
}

}
