package com.wwq.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.wwq.hibernate.util.HibernateSessionFactory;

public class HQLTestThree {
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		// -------------- API事例 --------------
		List cats = session.createCriteria(Person.class)
				.add(Restrictions.like("name", "周%")).addOrder(Order.asc("id"))
				.list();
		// -------------- 完全面向对象 --------------
		Criteria crt = session.createCriteria(Person.class);
		// 比较Restrictions
		crt.add(Restrictions.eq("name", "周芷若"));
		// crt.add(Restrictions.lt("id", new Integer(2)));
		// crt.add(Restrictions.between("id", new Integer(2), new Integer(3)));
		// crt.add(Restrictions.like("name", "%无%"));
		// -------------- 排序Order --------------
		crt.addOrder(Order.desc("id"));
		// -------------- example 可以传入所需的任何条件 --------------
		Person per = new Person();
		per.setName("周芷若");
		per.setSex("女");
		crt.add(Example.create(per));
		// -------------- 从第几个开始 --------------
		crt.setFirstResult(0);
		// -------------- 一共查询几条 --------------
		crt.setMaxResults(2);
		// -------------- 循环显示结果 --------------
		List list = crt.list();
		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);
			System.out.println("封装类Criteria查询: " + p.toString());
		}
		Transaction tx = null;
		tx = session.beginTransaction();

		try {
			// -------------- 原生查询 --------------
			String sqlSelect = "select name from person where id=1";
			SQLQuery sqSelect = session.createSQLQuery(sqlSelect);
			List listSelect = sqSelect.list();
			for (int i = 0; i < listSelect.size(); i++) {
				String name = (String) listSelect.get(i);
				System.out.println("原生查询： " + name);
			}
			// -------------- 原生更新 --------------
			String hqlUpdate = "update Person as a set a.role='峨眉掌门' where a.id =2";
			SQLQuery sqUpdate = session.createSQLQuery(hqlUpdate);
			int updateConut = sqUpdate.executeUpdate();
			System.out.println("原生更新影响： " + updateConut);
			// -------------- 原生删除 --------------
			String sqlDelect = "delete from person where id =4";
			SQLQuery sqDelect = session.createSQLQuery(sqlDelect);
			int delectConut = sqDelect.executeUpdate();
			System.out.println("原生删除影响： " + delectConut);

			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
			HibernateSessionFactory.getSessionFactory().close();
		}
	}
}
