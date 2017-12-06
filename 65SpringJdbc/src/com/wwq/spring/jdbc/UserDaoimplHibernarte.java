package com.wwq.spring.jdbc;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.wwq.spring.bean.Person;
import com.wwq.spring.bean.UserDao;

public class UserDaoimplHibernarte implements UserDao {
	private HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	@Override
	public int delete(Person p) {
		template.delete(p);
		return 1;
	}

	@Override
	public void add(Person p) {
		template.save(p);
	}

	@Override
	public List listPerson() {
		String sql ="from Person";
		List list = template.find(sql);
		return list;
	}

	@Override
	public void update(Person p) {
		template.update(p);
	}
}
