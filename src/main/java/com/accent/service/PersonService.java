package com.accent.service;

import java.util.List;

import com.accent.domain.Person;

public interface PersonService {
	
	public List<Person> getMaleGender(String gender);

	public List<Person> getFemaleGender(String gender);
}
