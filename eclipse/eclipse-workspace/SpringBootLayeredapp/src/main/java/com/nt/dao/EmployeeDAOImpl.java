package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public  class EmployeeDAOImpl implements EmployeeDAO {
	private static final String INSERT_EMP_QUERY="INSERT INTO LAYERED_EMP(name,address,basicsal,grossssal,netsal) VALUES(?,?,?,?,?)";
	@Autowired
	private DataSource ds;

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl.insert() ::: ds-->"+ds.getClass());
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		con=ds.getConnection();
		
		ps=con.prepareStatement(INSERT_EMP_QUERY);
		
		ps.setString(1, bo.getEmpName());
		ps.setString(2, bo.getEmpAddress());
		ps.setFloat(3, bo.getBasicSalary());
		ps.setFloat(4, bo.getGrossSalary());
		ps.setFloat(5, bo.getNetSalary());		
		count=ps.executeUpdate();		
		
		ps.close();
		con.close();	
		return count;
	}
}
