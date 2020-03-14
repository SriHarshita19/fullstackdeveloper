package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.nt.dto.EmplyoeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

@Controller("controller")
public class MainController {
	@Autowired
	 private EmployeeService  service;
	
	public   String processEmployee(EmployeeVO vo)throws   Exception{
		EmplyoeeDTO dto=null;
		String result=null;
		
		dto=new EmplyoeeDTO();
		dto.setEmpName(vo.getEmpName());
		dto.setEmpAddress(vo.getEmpAddress());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		
		result=service.registerEmployee(dto);
		return result;
	}
}
