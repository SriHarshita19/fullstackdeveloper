package com.cts.training.companyservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Table(name="company")
@XmlRootElement(name = "companylist")
public class Company {
	@Id
	@GeneratedValue
	private int id;
	private String companyname;
	private String sector;
	private String ceoname;
	private String bod;
	private double turnover;
	private String companyCode;
	
	public Company() {
		
		
	}
	
	

	public Company(int id, String companyname, String sector, String ceoname, String bod, double turnover,
			String companyCode) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.sector = sector;
		this.ceoname = ceoname;
		this.bod = bod;
		this.turnover = turnover;
		this.companyCode = companyCode;
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

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCeoname() {
		return ceoname;
	}

	public void setCeoname(String ceoname) {
		this.ceoname = ceoname;
	}

	public String getBod() {
		return bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyname=" + companyname + ", sector=" + sector + ", ceoname=" + ceoname
				+ ", bod=" + bod + ", turnover=" + turnover + ", companyCode=" + companyCode + "]";
	}
	
	

	

	}
