package com.wwq.cinema.dao;

import org.hibernate.Session;

import com.wwq.cinema.util.HibernateUtil;

public class BaseHibernateDAO {
	
	public Session getSession() {
		return HibernateUtil.getSession();
	}	
	public void closeSession(){
		HibernateUtil.closeSession();
	}	
}