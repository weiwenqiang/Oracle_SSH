package com.wwq.spring.bean;

public class CRUD {
	//ÉèÖµ×¢Èë
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
	public void insert(){
		dao.insert();
	}

}
