package com.example.demo.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User1 {
@Id
int id;
String username;
String password;
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

}