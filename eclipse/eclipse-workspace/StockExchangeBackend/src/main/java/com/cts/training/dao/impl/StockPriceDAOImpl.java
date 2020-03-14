package com.cts.training.dao.impl;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cts.training.model.StockPrice;

import com.cts.training.dao.StockPriceDAO;
@Transactional
@Repository(value="stockPriceDAO")
public class StockPriceDAOImpl implements StockPriceDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean saveorUpdateStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(stockPrice);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean deleteStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().delete(stockPrice);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public StockPrice getStockPriceById(int id) {
		try {
			return sessionFactory.getCurrentSession().get(StockPrice.class, id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<StockPrice> displayAllStockPrices() {
		try {
			List<StockPrice> stockPrices = sessionFactory.getCurrentSession().createQuery("from StockPrice").list();
			return stockPrices;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean saveStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().save(stockPrice);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean updateStockPrice(StockPrice stockPrice) {
		try {
			sessionFactory.getCurrentSession().update(stockPrice);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}
}