package com.wwq.cinema.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

public class TypeDAO extends BaseHibernateDAO {
	
	
	public List getAllType(){
		
		List result = null;
		try {
			Query query = this.getSession().createQuery("from FilmType");
			result = query.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		} finally{
			this.closeSession();
		}
		return result;
	}

}
