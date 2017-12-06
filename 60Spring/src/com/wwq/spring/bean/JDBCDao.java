package com.wwq.spring.bean;

public class JDBCDao implements UserDao{

	@Override
	public void insert() {
		System.out.print("使用JDBC来新增数据");
		
	}

}
