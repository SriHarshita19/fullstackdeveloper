package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;


@SpringBootApplication
@Import(AppConfig.class)
public class SpringBootLayeredappApplication {
	public static void main(String[] args) {
		Scanner sc=null;
		EmployeeVO vo=null;
		String eno=null,ename=null,eadd=null,bsal=null;
		MainController controller=null;
		String result=null;
		ApplicationContext ctx=null;
		
		sc=new Scanner(System.in);
		System.out.println("Enter employee name::");
		ename=sc.next();
		System.out.println("Enter Employee Address::");
		eadd=sc.next();
		System.out.println("Enter Employee basic Salary::");
		bsal=sc.next();
		
		vo=new EmployeeVO();
		vo.setEmpName(ename);
		vo.setEmpAddress(eadd);
		vo.setBasicSalary(bsal);
		
		ctx=SpringApplication.run(SpringBootLayeredappApplication.class, args);		
		controller=ctx.getBean("controller",MainController.class);
		
		try {
			result=controller.processEmployee(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			if(((SQLException)e).getErrorCode()==1)
				System.out.println("Emplyee already registered ");
			else if(((SQLException)e).getErrorCode()==12899)
				System.out.println("Emplyee info is larger than given col size ");
			else if(((SQLException)e).getErrorCode()==947)
				System.out.println("Emplyee info insufficient to insert ");
			else
				System.out.println("Unknown Internal Problem ");
		}		
		 ((AbstractApplicationContext) ctx).close();
	}
}