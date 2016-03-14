package com.kdyzm.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kdyzm.dao.PeopleDao;
import com.kdyzm.domain.People;
import com.kdyzm.service.PeopleService;

@Service("peopleService")
public class PeopleServiceImpl implements PeopleService {
	@Resource(name = "peopleDao")
	private PeopleDao peopleDao;

	@Override
	public People findPeopleById(Serializable id) {
		return peopleDao.findById(id);
	}

}
