package com.cts.training.stockExchangeservice.service;

import java.util.List;

import com.cts.training.stockExchangeservice.model.StockExchange;


public interface StockExchangeService {
	public StockExchange insert(StockExchange stockExchange);
	public  StockExchange update(StockExchange stockExchange);
	public void deleteById(int id);
	public StockExchange getElementById(int id);
	public List<StockExchange> getAllStockExchanges();
}


