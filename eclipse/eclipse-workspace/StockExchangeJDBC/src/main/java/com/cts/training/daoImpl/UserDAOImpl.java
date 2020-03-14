package com.cts.training.daoImpl;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cts.training.dao.UserDAO;

public class UserDAOImpl {
	private JdbcTemplate jdbcTemplate; 
	 
	public boolean setJdbcTemplate(JdbcTemplate jdbcTemplate) { 
	 	this.jdbcTemplate = jdbcTemplate;
	 	String query = "insert into user values(?,?,?,?,?)"; 
 	 	try { 
               jdbcTemplate.update(query, UserDAO.getId(), UserDAO.getUsername(), UserDAO.getPassword(), UserDAO.getEmail(), UserDAO.getPhone()); 
 	 	 	      return true; 
 	 	} 
 	 	catch (DataAccessException e) { 
 	 		e.printStackTrace(); 
 	 	 	return false; 
 	 	} 
 	

	 	} 
	
}
