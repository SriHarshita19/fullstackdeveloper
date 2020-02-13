package com.cts.training.test;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.training.model.User;
import com.cts.training.dao.UserDAO;
import com.cts.training.dao.impl.UserDAOImpl;
public class UserUnitTest {
	private static  AnnotationConfigApplicationContext context;
	@Autowired
	private static UserDAO userDAO;
	private static User user;
	@BeforeClass
	public static void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		user =(User) context.getBean("user");
		userDAO =(UserDAO) context.getBean("userDAO");
	}
//	@Test
//	@Ignore
//	public void testGetAllUsers() {
//		List<User> users=userDAO.getAllUsers();
//		assertEquals(3,users.size());
//		//fail("Not yet implemented");
//	}
//	@Test
//	@Ignore
//	public void test_update_user_success() {
//		User u=userDAO.getUserById(105);
//		u.setEnabled(false);
//		assertEquals(true, userDAO.updateUser(u));
//	}
//	@Test
//	@Ignore
//	public void test_user_login() {
//		assertEquals(true,userDAO.isValidUser("Akhil", "1235678"));
//	}
//	@Test(expected=NullPointerException.class)
//	@Ignore
//	public void test_get_user_by_id_fail() {
//		User u=userDAO.getUserById(109);
//		assertEquals("Krishna",u.getUsername());
//	}
//	@Test
//	@Ignore
//	public void test_delete_user() {
//		User u=userDAO.getUserById(105);
//		assertEquals(true,userDAO.deleteUser(u));
//	}
	@Test
	public void test_save_user_success() {
		User u=new User("hello", "123", "hi@gmail", 365578, false);
		System.out.println(u);
		assertEquals(true,userDAO.saveorUpdate(u));
	}
}