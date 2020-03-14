package com.cts.training.initialpublicofferingservice.model;
import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Component;
@Entity
@Table(name = "ipos")
@Component(value="ipo")
public class InitialPublicOffering implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	private String companyname;
	private String stockexchange;
	private double shares;
	private double price;
	private LocalDateTime opendatetime;
	private String remarks;
	public InitialPublicOffering() {
	}
	public InitialPublicOffering(int id, String companyname, String stockexchange, double shares, double price,
			LocalDateTime opendatetime, String remarks) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.stockexchange = stockexchange;
		this.shares = shares;
		this.price = price;
		this.opendatetime = opendatetime;
		this.remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public double getShares() {
		return shares;
	}
	public void setShares(double shares) {
		this.shares = shares;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public LocalDateTime getOpendatetime() {
		return opendatetime;
	}
	public void setOpendatetime(LocalDateTime opendatetime) {
		this.opendatetime = opendatetime;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "IPO [id=" + id + ", companyname=" + companyname + ", stockexchange=" + stockexchange + ", shares="
				+ shares + ", price=" + price + ", opendatetime=" + opendatetime + ", remarks=" + remarks + "]";
	}
	}