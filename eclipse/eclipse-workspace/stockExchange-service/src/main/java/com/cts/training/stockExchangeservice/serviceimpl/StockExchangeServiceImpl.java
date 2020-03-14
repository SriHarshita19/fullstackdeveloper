package com.cts.training.stockExchangeservice.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.stockExchangeservice.dao.StockExchangeDAO;
import com.cts.training.stockExchangeservice.model.StockExchange;
import com.cts.training.stockExchangeservice.service.StockExchangeService;

@Service
public class StockExchangeServiceImpl implements StockExchangeService{
@Autowired
StockExchangeDAO stockExchangeDAO;
	@Override
	public StockExchange insert(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		StockExchange savestockExchange =  stockExchangeDAO.save( stockExchange);
		return savestockExchange;

	}

	@Override
	public StockExchange update(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		StockExchange  stockExchangeupdate =  stockExchangeDAO.save( stockExchange);
		return  stockExchangeupdate;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		 stockExchangeDAO.deleteById(id);
		
	}

	@Override
	public StockExchange getElementById(int id) {
		// TODO Auto-generated method stub
		Optional<StockExchange>  stockExchange =  stockExchangeDAO.findById(id);
		StockExchange  stockExchangeid =  stockExchange.get();
		return  stockExchangeid;
		
	}

	@Override
	public List<StockExchange> getAllStockExchanges() {
		// TODO Auto-generated method stub
		return  stockExchangeDAO.findAll();
		
	}

	
}

