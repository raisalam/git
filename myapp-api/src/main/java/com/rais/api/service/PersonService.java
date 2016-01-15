package com.rais.api.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.rais.core.model.Person;

public interface PersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	
}
