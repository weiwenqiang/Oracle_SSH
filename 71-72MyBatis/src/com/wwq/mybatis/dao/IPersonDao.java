package com.wwq.mybatis.dao;

import com.wwq.mybatis.vo.Person;

public interface IPersonDao {
	public void query();
	public void addPerson(Person p);
	public void updateperson(Person p);
	public void deletePerson(Person p);
}
