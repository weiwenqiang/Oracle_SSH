package com.wwq.spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.wwq.spring.bean.Person;
import com.wwq.spring.bean.UserDao;

public class UserDaoimpl implements UserDao {
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	@Override
	public int delete(Person p) {
		String sql="delete from person where id=?";
		template.update(sql, new Object[]{p.getId()});
		return 1;
	}

	@Override
	public void add(Person p) {
		String sql ="insert into person values(?,?)";
		template.update(sql, new Object[]{p.getId(),p.getName()});
	}

	@Override
	public List listPerson() {
		String sql ="select * from person";
		List list = template.queryForList(sql);
		return list;
	}

	@Override
	public void update(Person p) {
		String sql="update person set name=? where id =?";
		template.update(sql, new Object[]{p.getName(),p.getId()});
	}

}
