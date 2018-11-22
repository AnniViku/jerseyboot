package com.accent.dao;

import java.util.ArrayList;
import java.util.List;

import com.accent.domain.Person;

public interface PersonDao {
	
	
	public List<Person> getAllMaleGender(String gender);
	public List<Person> getAllFemaleGender(String gender);

}
