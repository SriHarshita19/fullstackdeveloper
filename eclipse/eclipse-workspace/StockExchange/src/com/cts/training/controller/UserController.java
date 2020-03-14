package com.cts.training.controller;
import com.cts.training.model.User;
import com.cts.training.dao.UserDAO;
import com.cts.training.dao.impl.UserDAOImpl;

public class UserController {
	public static void main(String[] args) {
		User user = new User(106, "Yasmin", "467365", "yasmin@cts.com", 95794567L, false);
		UserDAO userDAO = new UserDAOImpl();
//Saving User
//		boolean status = userDAO.saveUser(user);
//		if (status) {
//			System.out.println("user Saved Successfully");
//		} else {
//			System.out.println("Try Again");
//		}
//Updating User
		
boolean status=userDAO.isValidUser("anu", "12345");
if(status)
{
	System.out.println("valid user");
}
else {
	System.out.println("invalid user");
}
}
}