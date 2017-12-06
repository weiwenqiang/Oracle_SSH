package com.wwq.mybatis.test;

import com.wwq.mybatis.dao.IPersonDao;
import com.wwq.mybatis.dao.PersonDaoIMPL;
import com.wwq.mybatis.vo.Person;

public class Test {
	public static void main(String[] args) {
		PersonDaoIMPL p1 = new PersonDaoIMPL();
		Person p = new Person();
		p.setId(21);
		p.setName("张三丰");
		p.setSalary(9000);
		//添加
		p1.addPerson(p);
		//查询
		p1.query();
	}
}
