package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.model.StockExchange;

@Transactional
@Repository(value="stockExchangeDAO")
public class StockExchangeDAOImpl implements StockExchangeDAO{
	@Autowired
	SessionFactory sessionFactory;

	
	@Override
	public boolean deleteStockExchange(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(stockExchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public StockExchange getStockExchangeById(int id) {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession().get(StockExchange.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
	  }
	}

	@Override
	public List<StockExchange> getAllStockExchanges() {
		// TODO Auto-generated method stub
		try {
			List<StockExchange> StockExchanges = sessionFactory.getCurrentSession().createQuery("from StockExchange").list();
			return StockExchanges;
		} catch (HibernateException e) {
			e.printStackTrace();
		return null;
	}
	}

	@Override
	public boolean saveOrUpdateStockExchange(StockExchange stockExchange) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(stockExchange);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
	}
	}
}

