package com.spring.app.dao.impl;

import org.hibernate.criterion.Restrictions;

import com.spring.app.dao.UserAccountDAO;
import com.spring.app.entity.UserAccount;

public class UserAccountDAOImpl extends BaseDAOImpl implements UserAccountDAO{
	public boolean createAccount(String name,int pwd) {
		// TODO Auto-generated method stub
		getSession().save(name);
		getSession().save(pwd);
		 getSession().createCriteria(UserAccount.class).add(Restrictions.
				 and(Restrictions.eq("userName", name), Restrictions.eq("pwd", pwd)));
		             //return criterion                 return criterion
		return true;
		
	}


}
