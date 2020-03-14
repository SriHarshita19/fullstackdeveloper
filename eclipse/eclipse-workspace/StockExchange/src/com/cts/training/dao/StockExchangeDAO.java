package com.cts.training.dao;
import com.cts.training.model.StockExchange;
import java.util.List;

import com.cts.training.model.User;

public interface StockExchangeDAO {

	public boolean saveStockExchnage(StockExchange stockExchange);

	public boolean updateStockExchange(StockExchange stockExchange);

	public boolean deleteStockExchange(StockExchange stockExchange);

	public User getStockExchangeById(int id);

	public List<StockExchange> getAllStockExchanges();
}
