package com.wwq.mybatis.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.wwq.mybatis.utils.SessionUtil;
import com.wwq.mybatis.vo.Person;

public class PersonDaoIMPL implements IPersonDao {
	public void query() {
		SqlSession session = new SessionUtil().getSession();		
		try {
			List list = session.selectList("mybatis.selectPerson");
		    for(int i=0;i<list.size();i++){
		    	Person p = (Person)list.get(i);
		        System.out.println(p.getId());
		    	System.out.println(p.getName());
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void addPerson(Person p) {
		SqlSession session = new SessionUtil().getSession();        
		try {
			session.insert("mybatis.addperson",p);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void updateperson(Person p) {
		SqlSession session = new SessionUtil().getSession();       
		try {
			session.update("mybatis.updateperson",p);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void deletePerson(Person p) {
		SqlSession session = new SessionUtil().getSession();       
		try {
			session.delete("mybatis.deleteperson",p);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
