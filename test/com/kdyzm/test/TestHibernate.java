/*package com.kdyzm.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kdyzm.domain.People;

public class TestHibernate {
	private static SessionFactory sessionFactory=null;
	static{
		Configuration configuration=new Configuration();
		configuration.configure();
		sessionFactory=configuration.buildSessionFactory();
	}
	public static void main(String[] args) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		People people=(People) session.get(People.class, 1);
		System.out.println(people);
		transaction.commit();
		session.close();
		//测试成功
		System.exit(0);
	}
}
*/