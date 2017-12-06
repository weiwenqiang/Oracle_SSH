package com.wwq.ibatis.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.wwq.ibatis.vo.Person;

public class PersonDaoImplHibernate extends SqlMapClientDaoSupport {
	private SqlMapClient sqlMapClient;
	
	public void addPerson(Person p) {
	}

	public void query() {
		SqlMapClientTemplate client = super.getSqlMapClientTemplate();
		List<Person> list = client.queryForList("selectfromperson");
		for(int i =0; i<list.size(); i++){
			System.out.println(list.get(i).getName());
		}
	}

	public void updatePerson(Person p) {
	}

	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}
}
