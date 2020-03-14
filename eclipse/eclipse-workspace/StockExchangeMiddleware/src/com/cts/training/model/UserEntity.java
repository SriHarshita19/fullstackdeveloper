package com.cts.training.model;
import java.io.Serializable;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class UserEntity implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 7617538566075690995L;
	private int id;
	private String username;
	private String password;
	private List<String> email;
	private long phone;
	private AddressEntity address;
	private boolean enabled ;
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
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> string) {
		this.email = string;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public boolean enabled() {
		return enabled();
	}
	public void setEnabled(boolean isEnabled) {
		this.enabled = isEnabled;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public AddressEntity getAddress() {
		return address;
	}
	public void setAddress(AddressEntity address) {
		this.address = address;
	}
}