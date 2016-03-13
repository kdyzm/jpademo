package com.kdyzm.main;

import com.kdyzm.domain.People;
import com.kdyzm.service.PeopleService;
import com.kdyzm.service.impl.PeopleServiceImpl;

public class Main {
	private static PeopleService peopleService = new PeopleServiceImpl();

	public static void main(String[] args) {
		People people = peopleService.findPeopleById(1);
		System.out.println(people);
	}
}
