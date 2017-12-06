package com.wwq.spring;

public class UserDaoimpl implements UserDao {

	@Override
	public String delete(String name) {
		System.out.println(name+" ¼ÇÂ¼ÈÕÖ¾");
		return "1";
	}

}
