package com.kdyzm.dao.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kdyzm.dao.PeopleDao;
import com.kdyzm.domain.People;

public class PeopleDaoImpl implements PeopleDao {
	/*private static SessionFactory sessionFactory = null;

	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}*/

	@Override
	public People findPeopleById(Serializable id) {
		/*Session session = sessionFactory.openSession();
		try {
			return (People) session.get(People.class, id);
		} catch (Exception e) {
			session.close();
		}
		return null;*/
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		People people=entityManager.find(People.class, id);
		entityManager.close();
		return people;
	}

}
