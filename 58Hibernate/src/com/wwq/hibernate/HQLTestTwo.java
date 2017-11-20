package com.wwq.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wwq.hibernate.util.HibernateSessionFactory;

public class HQLTestTwo {
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		/**
		 * �����Ĵ���
		 */
		// -------------- AVG --------------
		String hqlAvg = "select avg(a.id) from Person as a";
		Query queryAvg = session.createQuery(hqlAvg);
		List listAvg = queryAvg.list();
		for (int i = 0; i < listAvg.size(); i++) {
			Double j = (Double) listAvg.get(i);
			System.out.println("AVG: " + j);
		}
		// -------------- MIN OR MAX --------------
		String hqlMinMax = "select min(a.id),max(a.id) from Person as a";
		// -------------- ���� --------------
		String hqlOrder = " from Person as a order by a.id desc";
		Query queryOrder = session.createQuery(hqlOrder);
		List listOrder = queryOrder.list();
		for (int i = 0; i < listOrder.size(); i++) {
			Person j = (Person) listOrder.get(i);
			System.out.println("���� " + j.toString());
		}
		// -------------- �Ӳ�ѯ --------------
		String hqlWhere = "from Person as a where a.id<(select max(b.id) from Person as b )";
		Query queryWhere = session.createQuery(hqlWhere);
		List listWhere = queryWhere.list();
		for (int i = 0; i < listWhere.size(); i++) {
			Person j = (Person) listWhere.get(i);
			System.out.println("�Ӳ�ѯ: " + j.toString());
		}
	}
}
