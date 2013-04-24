package com.spring.app.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.app.dao.BaseDAO;

public class BaseDAOImpl implements BaseDAO{
	
	 @Autowired
	 private SessionFactory sessionFactory;

	public Session getSession() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession();
	}
	}
