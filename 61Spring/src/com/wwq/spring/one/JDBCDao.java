package com.wwq.spring.one;

import java.sql.Connection;

public class JDBCDao implements UserDao{
	public ConnectionUtil cu;

	@Override
	public void insert() {
		Connection c = cu.getConn();
		System.out.print("ʹ��JDBC����������");
		
	}
	public void setCu(ConnectionUtil cu) {
		this.cu = cu;
	}
}
