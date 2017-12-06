package com.wwq.spring.bean;

import java.util.List;

public interface UserDao {
	public int delete(Person p);
	public void add(Person p);
	public List listPerson();
	public void update(Person p);
	public void transfer();
}
