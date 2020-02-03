package com.cts.training.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passport")
public class PassportDetails {
@Id
@GeneratedValue
private int id;
private String passportNumber;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassportNumber() {
	return passportNumber;
}
public void setPassportNumber(String passportNumber) {
	this.passportNumber = passportNumber;
}



}
