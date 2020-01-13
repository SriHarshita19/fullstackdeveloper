package com.cts.main;

public class ExceptionDemo {
public static boolean isValidUser(String user)throws InvalidUser
{
	if(!user.equals("ADMIN"))
	{
		throw new InvalidUser();
	}
	return true;
}

public static void main(String args[])
{
	try
	{
		isValidUser("admin");
	}
	catch(InvalidUser e)
	{
		System.out.println(e.getMessage());
	}
}
}
class InvalidUser extends Exception
{
	InvalidUser()
	{
		
	}
	InvalidUser(String message)
	{
		System.out.println(message);
		
	}
	public String getMessage()
	{
		return "invalid user";
	}
}
