package com.wwq.spring.one;

public class UserDaoimpl implements UserDao {

	@Override
	public String delete(String name) {
		System.out.println(name+" [] �Ѿ�������־");
		return "1";
	}

}
