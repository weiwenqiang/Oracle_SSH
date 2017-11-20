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
		// -------------- API���� --------------
		List cats = session.createCriteria(Person.class)
				.add(Restrictions.like("name", "��%")).addOrder(Order.asc("id"))
				.list();
		// -------------- ��ȫ������� --------------
		Criteria crt = session.createCriteria(Person.class);
		// �Ƚ�Restrictions
		crt.add(Restrictions.eq("name", "������"));
		// crt.add(Restrictions.lt("id", new Integer(2)));
		// crt.add(Restrictions.between("id", new Integer(2), new Integer(3)));
		// crt.add(Restrictions.like("name", "%��%"));
		// -------------- ����Order --------------
		crt.addOrder(Order.desc("id"));
		// -------------- example ���Դ���������κ����� --------------
		Person per = new Person();
		per.setName("������");
		per.setSex("Ů");
		crt.add(Example.create(per));
		// -------------- �ӵڼ�����ʼ --------------
		crt.setFirstResult(0);
		// -------------- һ����ѯ���� --------------
		crt.setMaxResults(2);
		// -------------- ѭ����ʾ��� --------------
		List list = crt.list();
		for (int i = 0; i < list.size(); i++) {
			Person p = (Person) list.get(i);
			System.out.println("��װ��Criteria��ѯ: " + p.toString());
		}
		Transaction tx = null;
		tx = session.beginTransaction();

		try {
			// -------------- ԭ����ѯ --------------
			String sqlSelect = "select name from person where id=1";
			SQLQuery sqSelect = session.createSQLQuery(sqlSelect);
			List listSelect = sqSelect.list();
			for (int i = 0; i < listSelect.size(); i++) {
				String name = (String) listSelect.get(i);
				System.out.println("ԭ����ѯ�� " + name);
			}
			// -------------- ԭ������ --------------
			String hqlUpdate = "update Person as a set a.role='��ü����' where a.id =2";
			SQLQuery sqUpdate = session.createSQLQuery(hqlUpdate);
			int updateConut = sqUpdate.executeUpdate();
			System.out.println("ԭ������Ӱ�죺 " + updateConut);
			// -------------- ԭ��ɾ�� --------------
			String sqlDelect = "delete from person where id =4";
			SQLQuery sqDelect = session.createSQLQuery(sqlDelect);
			int delectConut = sqDelect.executeUpdate();
			System.out.println("ԭ��ɾ��Ӱ�죺 " + delectConut);

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