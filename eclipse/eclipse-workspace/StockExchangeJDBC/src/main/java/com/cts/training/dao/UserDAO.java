package com.cts.training.dao;

import java.io.Serializable;
public class UserDAO implements Serializable {
	private static final long serialVersionUID = -5376520827710642568L;
	private int id;
	private String username;
	private String password;
	private String email;
	private long phone;
	public UserDAO() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public UserDAO(int id, String username, String password, String email, long phone) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "UserDao [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + "]";
	}

}
