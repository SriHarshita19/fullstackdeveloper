package com.cts.training.model;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Entity
@Component
@Table
public class StockPrice implements Serializable{
	private static final long serialVersionUID = 2418334347026050569L;
	@Id
	@GeneratedValue
	private int company_id;
	private String stock_exchange;
	private double current_price;
	private LocalDateTime opendatetime;
	public StockPrice() {
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public String getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(String stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	public double getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(double current_price) {
		this.current_price = current_price;
	}
	public LocalDateTime getOpendatetime() {
		return opendatetime;
	}
	public void setOpenDateTime(String openDateTime) {
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd'T'H:m");
		this.opendatetime=LocalDateTime.parse(openDateTime, formatter);
	}
	public StockPrice(int company_id, String stock_exchange, double current_price, LocalDateTime opendatetime) {
		super();
		this.company_id = company_id;
		this.stock_exchange = stock_exchange;
		this.current_price = current_price;
		this.opendatetime = opendatetime;
	}
	@Override
	public String toString() {
		return "StockPrice [company_id=" + company_id + ", stock_exchange=" + stock_exchange + ", current_price="
				+ current_price + ", opendatetime=" + opendatetime + "]";
	}
}