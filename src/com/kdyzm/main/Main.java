package com.kdyzm.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kdyzm.domain.People;
import com.kdyzm.service.PeopleService;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PeopleService peopleService = (PeopleService) context.getBean("peopleService");
		People people = peopleService.findPeopleById(1);
		System.out.println(people);
	}
}
