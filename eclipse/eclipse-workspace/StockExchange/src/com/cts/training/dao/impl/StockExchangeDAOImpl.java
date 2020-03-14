package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.training.dao.StockExchangeDAO;
import com.cts.training.hibernate.HibernateUtil;
import com.cts.training.model.StockExchange;


public class StockExchangeDAOImpl implements StockExchangeDAO {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	public boolean addStockExchange(StockExchange stockExchange) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.save(stockExchange);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean updateStockExchange(StockExchange stockExchange) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(stockExchange);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public boolean deleteStockExchange(StockExchange stockExchange) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			session.delete(stockExchange);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	
	public StockExchange getStockExchangeById(int id) {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			StockExchange stockExchange = session.get(StockExchange.class, id);

			tx.commit();
			session.close();
			return stockExchange;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
	

	public List<StockExchange> getAllStockExchanges() {
		try {
			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			List<StockExchange> stockExchanges = session.createQuery("from StockExchange").list();
			tx.commit();
			session.close();
			return stockExchanges;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}


}
