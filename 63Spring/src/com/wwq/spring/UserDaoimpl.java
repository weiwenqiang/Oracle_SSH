package com.wwq.spring;

public class UserDaoimpl implements UserDao {

	@Override
	public String delete(String name) {
		System.out.println(name+" ��¼��־");
		return "1";
	}

}
