package com.wwq.spring.one;

public class UserDaoimpl implements UserDao {

	@Override
	public String delete(String name) {
		System.out.println(name+" [] 已经进入日志");
		return "1";
	}

}
