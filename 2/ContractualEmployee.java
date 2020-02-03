package com.cts.training.model;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contract")
//@DiscriminatorValue(value="CE")
//@PrimaryKeyJoinColumn(name="emp_id")
@AttributeOverrides({
	@AttributeOverride(name="id" , column=@Column(name="id")),
	@AttributeOverride(name="name" , column=@Column(name="name"))
})
public class ContractualEmployee extends Employee {
  private double payPerHour;
  private float contractPeriod;
public double getPayPerHour() {
	return payPerHour;
}
public void setPayPerHour(double payPerHour) {
	this.payPerHour = payPerHour;
}
public float getContractPeriod() {
	return contractPeriod;
}
public void setContractPeriod(float contractPeriod) {
	this.contractPeriod = contractPeriod;
}
  
}
