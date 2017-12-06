package com.wwq.spring.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.wwq.spring.bean.Person;
import com.wwq.spring.bean.UserDao;

public class UserDaoimplHibernarte implements UserDao {
	private HibernateSessionFactory factory;
	
	public void setFactory(HibernateSessionFactory factory) {
		this.factory = factory;
	}

	public void setTemplate(HibernateSessionFactory template) {
		this.factory = template;
		
	}
	@Override
	public int delete(Person p) {
		Session s = factory.getSession();
		s.delete(p);
		return 1;
	}

	@Override
	public void add(Person p) {
		Session s = factory.getSession();
		s.save(p);
		s.beginTransaction().commit();
	}

	@Override
	public List listPerson() {
		Session s = factory.getSession();
		String sql ="from Person";
		Query q = s.createQuery(sql);
		List<Person> list = q.list();
		return list;
	}

	@Override
	public void update(Person p) {
		Session s = factory.getSession();
		s.update(p);
	}
}
