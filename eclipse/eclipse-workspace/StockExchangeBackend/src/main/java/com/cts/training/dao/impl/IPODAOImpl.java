package com.cts.training.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.training.dao.IPODAO;
import com.cts.training.model.IPO;


@Transactional
@Repository(value="ipoDAO")
public class IPODAOImpl implements IPODAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addOrUpdateIPO(IPO ipo) {
		try {
			
			sessionFactory.getCurrentSession().save(ipo);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

//	@Override
//	public boolean updateIPO(IPO ipo) {
//		try {
//			
//			sessionFactory.getCurrentSession().update(ipo);
//			return true;
//		} catch (HibernateException e) {
//			e.printStackTrace();
//			return false;
//		}
//	}

	@Override
	public boolean deleteIPO(IPO ipo) {
		try {
			
			sessionFactory.getCurrentSession().delete(ipo);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public IPO getIPOById(int id) {
		try {
			
			return sessionFactory.getCurrentSession().get(IPO.class,id);
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<IPO> getAllIPOs() {
		try {
			
			List<IPO> ipos = sessionFactory.getCurrentSession().createQuery("FROM IPO").list();
			
			return ipos;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}
}
