package com.wwq.cinema.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

import com.wwq.cinema.entity.FilmInfo;
import com.wwq.cinema.entity.FilmType;
import com.wwq.cinema.util.SearchProperties;

public class FilmDAO extends BaseHibernateDAO {

	public List search(SearchProperties sp){ 
		List result = new ArrayList();
		try {
			Transaction tx = this.getSession().beginTransaction();
			tx.begin();
			Query query = this.getSession().getNamedQuery("searchFilm");		
			query.setProperties(sp);
			List filminfos = query.list();
			tx.commit();
			Iterator it = filminfos.iterator();
			while(it.hasNext()){
				Object[] results = (Object[])it.next();
				FilmInfo fi = (FilmInfo)results[0];
				FilmType ft = (FilmType)results[1];
				fi.setTypeId(ft.getTypeName());
				result.add(fi);
			}
		} catch (HibernateException e) {
			e.printStackTrace();
			throw e;
		} finally{
			this.closeSession();
		}
		return result;	
	}
    //增加电影信息
	public void add(FilmInfo item){ 
		
		Transaction tx = this.getSession().beginTransaction();
		try {		
			tx.begin();
			this.getSession().save(item);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
			throw e;
		} finally{
			this.closeSession();
		}
	}
	
	public static void main(String[] args){
		FilmDAO fd = new FilmDAO();
		SearchProperties sp = new SearchProperties();
		sp.setActor("%");
		sp.setBigprice(Double.MAX_VALUE);
		sp.setSmallprice(new Double(0));
		sp.setDirector("%");
		sp.setFilmname("%");
		sp.setTypeid("%");
		List list = fd.search(sp);
		Iterator it = list.iterator();
		while(it.hasNext()){
			FilmInfo fi = (FilmInfo)it.next();
			System.out.println("film" + fi.getFilmName() + "::" + fi.getTypeId());
		}
		
		
		
		
		
	}
	
	
}
