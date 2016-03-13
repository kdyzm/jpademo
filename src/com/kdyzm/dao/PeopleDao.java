package com.kdyzm.dao;

import java.io.Serializable;

import com.kdyzm.domain.People;

public interface PeopleDao {
	public People findPeopleById(Serializable id);
}
