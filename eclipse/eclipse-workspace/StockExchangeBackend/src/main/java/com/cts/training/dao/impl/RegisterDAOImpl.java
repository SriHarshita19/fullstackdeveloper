//package com.cts.training.dao.impl;
//import java.util.List;
//import org.hibernate.HibernateException;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//import com.cts.training.dao.RegisterDAO;
//import com.cts.training.model.Register;
//@Transactional
//public class RegisterDAOImpl implements RegisterDAO {
//	@Autowired
//	SessionFactory sessionFactory;
//	@Override
//	public boolean saveUser(Register register) {
//		try {
//			sessionFactory.getCurrentSession().save(register);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
//	@Override
//	public boolean updateUser(Register register) {
//		try {
//			sessionFactory.getCurrentSession().update(register);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
//	@Override
//	public boolean deleteUser(Register register) {
//		try {
//			sessionFactory.getCurrentSession().delete(register);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}
//	@Override
//	public Register getUserById(int id) {
//		try {
//			return sessionFactory.getCurrentSession().get(Register.class,id);
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//	@Override
//	public List<Register> getAllUsers() {
//		try {
//			List<Register> registers = sessionFactory.getCurrentSession().createQuery("from Register").list();
//			return registers;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return null;
//		}
//	}
//	public boolean isValidUser(String username, String Password) {
//		try {
//			Query query=sessionFactory.getCurrentSession().createQuery("from Register where username=:username and password=:password");
//			query.setString("username", username);
//			query.setString("password",Password);
//			Register user=(Register) query.uniqueResult();
//			if(user.getPassword()!=null)
//			{
//				return true;
//			}
//		} catch (HibernateException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
//}
//
//
