package com.cts.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.cts.main.EmployeeMain;
public class StreamApi {
	public static void main(String[] args) {
		List<EmployeeMain> employees =new ArrayList<EmployeeMain>();
		addEmployees(employees);
		//employees.forEach(System.out::println);
		//List<Employee> ageScale=employees.stream().filter(emp->emp.getAge()<22 && emp.getAddress().equals("Chennai")).collect(Collectors.toList());;
		//System.out.println("data with age <22\n");
		//ageScale.forEach(System.out::println);
		List<EmployeeMain> nameScale=employees.stream().filter(emp->emp.getName().length()>5).collect(Collectors.toList());
		System.out.println("data with namelength > 5\n");
	    nameScale.forEach(System.out::println);
	    List<EmployeeMain> nameScale1=employees.stream().map{emp->emp.setSalary()emp.getSalary()*1.1);return emp;)}.collect(Collectors.toList());
	}
	private static void addEmployees(List<EmployeeMain> employees) {
		EmployeeMain emp1 = new EmployeeMain();
		EmployeeMain emp2 = new EmployeeMain();
		employees.add(emp1);
		employees.add(emp2);
	}
}
