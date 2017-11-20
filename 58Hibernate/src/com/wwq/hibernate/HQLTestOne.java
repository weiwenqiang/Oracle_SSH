package com.wwq.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wwq.hibernate.util.HibernateSessionFactory;

public class HQLTestOne {
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		//---------------- ��ѯID ----------------
		// ռλ������ȡ����
		 String hqlSelectId="select a from com.wwq.hibernate.Person as a where id =:id";
		 Query querySelectId = session.createQuery(hqlSelectId);
		 querySelectId.setInteger("id", 1);
		 Person o=(Person)querySelectId.uniqueResult();
		 System.out.println("��ѯID�� "+o.getName()+"\t"+o.getRole()+"\t"+o.getSex());
		//---------------- ��ѯȫ�� ----------------
		String hql = "from Person";
		Query querySelectAll = session.createQuery(hql);
		List listSelectAll = querySelectAll.list();
		for (int i = 0; i < listSelectAll.size(); i++) {
			Person p = (Person) listSelectAll.get(i);
			System.out.println("��ѯȫ��: "+p.toString());
		}
		//---------------- ��ѯ������ ----------------
		String hqlSelectWhere ="select a from Person as a where name=:name or sex=:sex";
		Query querySelectWhere = session.createQuery(hqlSelectWhere);
		querySelectWhere.setString("name", "���޼�");
		querySelectWhere.setString("sex", "Ů");
		List listSelectWhere = querySelectWhere.list();
		for (int i = 0; i < listSelectWhere.size(); i++) {
			Person p = (Person) listSelectWhere.get(i);
			System.out.println("��ѯ������: "+p.toString());
		}
		//---------------- �޸�ɾ�� ----------------
		Transaction tx = null;
		tx = session .beginTransaction();
		try {
			//---------------- �޸� ----------------
			String hqlUpdate ="update Person as a set a.role=:role where a.id =:id";
			Query queryUpdate = session.createQuery(hqlUpdate);
			queryUpdate.setInteger("id", 1);
			queryUpdate.setString("role","��������");
			int updateCount = queryUpdate.executeUpdate();
			System.out.println("�޸�Ӱ��: "+updateCount);
			//---------------- ɾ�� ----------------
			String hqlDelete = "delete from Person where id=:id";
			Query queryDelete = session.createQuery(hqlDelete);
			queryDelete.setInteger("id", 4);
			int deleteCount = queryDelete.executeUpdate();
			System.out.println("ɾ��Ӱ��: "+deleteCount);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

	}
}
