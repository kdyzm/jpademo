package com.kdyzm.dao;

import java.io.Serializable;

import org.springframework.data.repository.Repository;

import com.kdyzm.domain.People;

public interface PeopleDao extends Repository<People, Integer> {
	public People findById(Serializable id);
}
