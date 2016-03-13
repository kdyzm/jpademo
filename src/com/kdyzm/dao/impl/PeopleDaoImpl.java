package com.kdyzm.dao.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.kdyzm.dao.PeopleDao;
import com.kdyzm.domain.People;

@Repository("peopleDao")
public class PeopleDaoImpl implements PeopleDao {
	@PersistenceContext(name = "entityManager")
	private EntityManager entityManager;

	@Override
	public People findPeopleById(Serializable id) {
		People people = entityManager.find(People.class, id);
		entityManager.close();
		return people;
	}

}
