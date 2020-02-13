package com.cts.training.model;


public class Employee {
	
	private int id;
	private String EmpName;
	private long phone;
	private String email;

	public Employee() {
		
	}
	
	

	public Employee(int id, String empName, long phone, String email) {
		super();
		this.id = id;
		this.EmpName = empName;
		this.phone = phone;
		this.email = email;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", EmpName=" + EmpName + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}
