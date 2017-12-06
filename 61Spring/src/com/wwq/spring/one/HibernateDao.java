package com.wwq.spring.one;

public class HibernateDao implements UserDao{

	@Override
	public void insert() {
		System.out.print("采用hiubernate来新增数据");
		
	}

}
