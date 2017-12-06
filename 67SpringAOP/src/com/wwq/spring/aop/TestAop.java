package com.wwq.spring.aop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wwq.spring.bean.Person;
import com.wwq.spring.bean.UserDao;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanaop.xml");
		UserDao dao = (UserDao)ac.getBean("userdao");
		Log log = new Log();
		dao.transfer();
	}
}
