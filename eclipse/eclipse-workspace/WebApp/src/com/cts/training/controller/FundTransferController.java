package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.model.CustAccount;
import com.cts.training.model.Customer;



public class FundTransferController {
public static void main(String args[])
{
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Customer entity=(Customer) context.getBean("user");
	System.out.println(entity.getName()+":"+entity.getAccNo());
	String name=entity.getName();
	System.out.println(name.getName());

}
}
