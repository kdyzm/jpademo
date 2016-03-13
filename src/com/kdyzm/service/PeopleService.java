package com.kdyzm.service;

import java.io.Serializable;

import com.kdyzm.domain.People;

public interface PeopleService {
	public People findPeopleById(Serializable id);
}
