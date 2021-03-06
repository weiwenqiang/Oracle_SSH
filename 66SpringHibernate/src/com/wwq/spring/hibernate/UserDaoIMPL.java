package com.wwq.spring.hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.wwq.spring.bean.Person;
import com.wwq.spring.bean.UserDao;

public class UserDaoIMPL extends HibernateDaoSupport implements UserDao {

	@Override
	public int delete(Person p) {
		super.getHibernateTemplate().delete(p);
		return 1;
	}

	@Override
	public void add(Person p) {
		super.getHibernateTemplate().save(p);
	}

	@Override
	public List listPerson() {
		String hql ="from Person";
		return super.getHibernateTemplate().find(hql);
	}

	@Override
	public void update(Person p) {
		super.getHibernateTemplate().update(p);
	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		
	}

}
