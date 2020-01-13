package com.cts.activity.main;

import java.util.List;

import com.cts.activity.bean.Employee;
import com.cts.activity.dao.EmployeeDAO;
import com.cts.activity.daoimpl.EmployeeDAOImpl;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		
//		Employee employee = employeeDAO.getEmployeeById(1);
//		System.out.println(employee);
		
		Employee employee = new Employee(103, "Akhil", "Pune", 22, 567576576L, 456456.00);
		
		boolean status = employeeDAO.addEmployee(employee);
//		
//		if(status)
//		{
//			System.out.println("Employee Added Successfully");
//		}else
//		{
//			System.out.println("Try Again");
//		}
//		Employee deleteEmployee=employeeDAO.getEmployeeById(101);
//		boolean result=employeeDAO.deleteEmployee(deleteEmployee);
//		if(result)
//		{
//			System.out.println("deleted successfully");
//		}
//		else
//		{
//			System.out.println("some problems");
//		}
//		List<Employee> list = employeeDAO.getAllEmployees();
//		for(Employee employee2 : list)
//		{
//			System.out.println(employee2);
//		}
		Employee updateEmployee=employeeDAO.getEmployeeById(101);
		updateEmployee.setAddress("kolkata");
		boolean update=employeeDAO.updateEmployee(updateEmployee);
		List<Employee> list1 = employeeDAO.getAllEmployees();
		for(Employee employee2 : list1)
		{
			System.out.println(employee2);
		}
		
		
				
		
		
		
		
		
		
		
		

	}

}
