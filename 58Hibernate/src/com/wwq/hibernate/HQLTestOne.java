package com.wwq.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wwq.hibernate.util.HibernateSessionFactory;

public class HQLTestOne {
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		//---------------- 查询ID ----------------
		// 占位符可以取别名
		 String hqlSelectId="select a from com.wwq.hibernate.Person as a where id =:id";
		 Query querySelectId = session.createQuery(hqlSelectId);
		 querySelectId.setInteger("id", 1);
		 Person o=(Person)querySelectId.uniqueResult();
		 System.out.println("查询ID： "+o.getName()+"\t"+o.getRole()+"\t"+o.getSex());
		//---------------- 查询全部 ----------------
		String hql = "from Person";
		Query querySelectAll = session.createQuery(hql);
		List listSelectAll = querySelectAll.list();
		for (int i = 0; i < listSelectAll.size(); i++) {
			Person p = (Person) listSelectAll.get(i);
			System.out.println("查询全部: "+p.toString());
		}
		//---------------- 查询多条件 ----------------
		String hqlSelectWhere ="select a from Person as a where name=:name or sex=:sex";
		Query querySelectWhere = session.createQuery(hqlSelectWhere);
		querySelectWhere.setString("name", "张无忌");
		querySelectWhere.setString("sex", "女");
		List listSelectWhere = querySelectWhere.list();
		for (int i = 0; i < listSelectWhere.size(); i++) {
			Person p = (Person) listSelectWhere.get(i);
			System.out.println("查询多条件: "+p.toString());
		}
		//---------------- 修改删除 ----------------
		Transaction tx = null;
		tx = session .beginTransaction();
		try {
			//---------------- 修改 ----------------
			String hqlUpdate ="update Person as a set a.role=:role where a.id =:id";
			Query queryUpdate = session.createQuery(hqlUpdate);
			queryUpdate.setInteger("id", 1);
			queryUpdate.setString("role","光明教主");
			int updateCount = queryUpdate.executeUpdate();
			System.out.println("修改影响: "+updateCount);
			//---------------- 删除 ----------------
			String hqlDelete = "delete from Person where id=:id";
			Query queryDelete = session.createQuery(hqlDelete);
			queryDelete.setInteger("id", 4);
			int deleteCount = queryDelete.executeUpdate();
			System.out.println("删除影响: "+deleteCount);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

	}
}
