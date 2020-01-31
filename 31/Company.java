package com.cts.training.model;
import java.io.Serializable;
public class Company implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5489410791576987483L;
	private int id;
    private String name;
    private String sector;
    private String CEOName;
    private double turnOver;
	
    public Company() {
    	
    }
    public Company(int id,String name,String sector,String CEOName,double turnOver) {
    	super();
    	this.id=id;
    	this.name=name;
    	this.sector=sector;
    	this.CEOName=CEOName;
    	this.turnOver=turnOver;
    	
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getCEOName() {
		return CEOName;
	}
	public void setCEOName(String CEOName) {
		CEOName = CEOName;
	}
	public double getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", sector=" + sector + ", CEOName=" + CEOName + ", turnOver="
				+ turnOver + "]";
	}
}
