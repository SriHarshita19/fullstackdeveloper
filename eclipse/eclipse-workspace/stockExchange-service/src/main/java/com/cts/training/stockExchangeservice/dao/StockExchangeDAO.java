package com.cts.training.stockExchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.training.stockExchangeservice.model.StockExchange;

public interface StockExchangeDAO  extends JpaRepository<StockExchange, Integer>{

}
