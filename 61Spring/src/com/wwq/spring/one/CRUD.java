package com.wwq.spring.one;

public class CRUD {
	//��ֵע��
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	public void insert(){
		dao.insert();
	}

}
