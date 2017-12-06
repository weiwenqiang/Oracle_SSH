package com.wwq.ibatis.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.wwq.ibatis.utils.GetSqlMapClient;
import com.wwq.ibatis.vo.Person;

public class PersonDaoIMPL implements IPersonDao {

	@Override
	public void query() {
		SqlMapClient client= GetSqlMapClient.getSapMapClient();
		try {
			List list = client.queryForList("selectfromperson");
			for (int i = 0; i <list.size(); i++) {
				Person p = (Person)list.get(i);
				System.out.println(p.getName());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void addPerson(Person p) {
		SqlMapClient client= GetSqlMapClient.getSapMapClient();
		try {
			client.insert("addperson",p );
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void updatePerson(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}

}
