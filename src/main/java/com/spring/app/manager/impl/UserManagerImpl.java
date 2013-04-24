package com.spring.app.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.dao.BaseDAO;
import com.spring.app.dao.UserAccountDAO;
import com.spring.app.entity.UserAccount;
import com.spring.app.manager.UserManager;
@Service
public class UserManagerImpl implements UserManager{

	public boolean createAccount(String name,int pwd) {
		// TODO Auto-generated method stub
		userAccountDAO.createAccount(name,pwd);
		return true;
		
	}
	@Autowired
	private UserAccountDAO userAccountDAO;

}

