package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.dao.EmployeeDAO;
import com.cts.training.model.Employee;

public class EmployeeController {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAOImpl");
		
		//insertion
//		Employee employee=new Employee(4,"honey",53656l,"honey@gmail.com");
//		System.out.println(employeeDAO.saveEmployee(employee));
//		System.out.println(employeeDAO.getAllEmployees());
//		
		//deletion
//		Employee employee=new Employee(4,"honey",53656l,"honey@gmail.com");
//		System.out.println(employeeDAO.deleteEmployee(employee));
		
		//update
		Employee employee=new Employee(1,"tom",889,"tom@gmail.com");
		System.out.println(employeeDAO.updateEmployee(employee));
		
		
		
	}

}
