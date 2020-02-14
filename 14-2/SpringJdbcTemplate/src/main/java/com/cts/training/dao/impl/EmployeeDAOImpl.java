package com.cts.training.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.dao.EmployeeDAO;
import com.cts.training.model.Employee;



public class EmployeeDAOImpl implements EmployeeDAO {
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public boolean saveEmployee(Employee employee) {
		String query = "insert into Employee values(?,?,?,?)";
		try {
		jdbcTemplate.update(query, employee.getId(),
		employee.getEmpName(), employee.getPhone(),employee.getEmail());
		return true;
		} catch (Exception e) {
		e.printStackTrace();
		return false;
		}

	}


	public boolean updateEmployee(Employee employee) {
		String query = "update Employee set empName=?, phone=?, email=? where id =?";
				try {
				jdbcTemplate.update(query, employee.getEmpName(), 
				employee.getEmail(),employee.getPhone(), employee.getId());
				return true;
				}
				catch (Exception e) {
				e.printStackTrace();
		return false;
	}
	}

	public boolean deleteEmployee(Employee employee) {
		String query = "delete from Employee where id =?";
		try {
		jdbcTemplate.update(query, employee.getId());
		return true;
		} catch (Exception e) {
		e.printStackTrace();
		return false;
		}

	}


	public Employee getEmployeeById(int id) {
		String query = "select * from Employee where id = ?";
		RowMapper<Employee> rowMapper = new
		BeanPropertyRowMapper<Employee>(Employee.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);

	}


	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM Employee";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}


}