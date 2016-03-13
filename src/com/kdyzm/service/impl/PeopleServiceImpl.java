package com.kdyzm.service.impl;

import java.io.Serializable;

import com.kdyzm.dao.PeopleDao;
import com.kdyzm.dao.impl.PeopleDaoImpl;
import com.kdyzm.domain.People;
import com.kdyzm.service.PeopleService;

public class PeopleServiceImpl implements PeopleService {
	private PeopleDao peopleDao = new PeopleDaoImpl();

	@Override
	public People findPeopleById(Serializable id) {
		return peopleDao.findPeopleById(id);
	}

}
