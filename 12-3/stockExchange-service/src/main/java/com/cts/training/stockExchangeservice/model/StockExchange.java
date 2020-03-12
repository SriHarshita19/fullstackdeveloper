package com.cts.training.stockExchangeservice.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "stockexchange")
@XmlRootElement
public class StockExchange {
@Id
@GeneratedValue
	private int id;
	private String stockexchange;
	private String contactaddress;
	private String brief;
	private String remarks;
	public StockExchange() {
	}
	public StockExchange(int id, String stockexchange, String contactaddress, String brief, String remarks) {
		super();
		this.id = id;
		this.stockexchange = stockexchange;
		this.contactaddress = contactaddress;
		this.brief = brief;
		this.remarks = remarks;
	}
	public StockExchange(int id, String stockexchange) {
		super();
		this.id = id;
		this.stockexchange = stockexchange;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStockexchange() {
		return stockexchange;
	}
	public void setStockexchange(String stockexchange) {
		this.stockexchange = stockexchange;
	}
	public String getContactaddress() {
		return contactaddress;
	}
	public void setContactaddress(String contactaddress) {
		this.contactaddress = contactaddress;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", stockexchange=" + stockexchange + ", contactaddress=" + contactaddress
				+ ", brief=" + brief + ", remarks=" + remarks + "]";
	}
}