package com.wwq.ibatis.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wwq.ibatis.dao.IPersonDao;
import com.wwq.ibatis.dao.PersonDaoIMPL;
import com.wwq.ibatis.dao.PersonDaoImplHibernate;
import com.wwq.ibatis.vo.Person;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		PersonDaoImplHibernate p = (PersonDaoImplHibernate)ac.getBean("persondao");
		p.query();
	}
}
