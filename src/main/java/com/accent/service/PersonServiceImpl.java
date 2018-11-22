package com.accent.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accent.dao.PersonDao;
import com.accent.dao.PersonDaoImpl;
import com.accent.domain.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao dao;


	@Override
	public List<Person> getMaleGender(String gender) {
		
		System.out.println("hiii");
		List<Person> maleList = dao.getAllMaleGender(gender);

		List<Person> personList = maleList.stream()
				.sorted((p1,p2)->p1.getAge()-p2.getAge())
				.collect(Collectors.toList());
		
		System.out.println(personList);
		return personList;
	}
	
	public List<Person> getFemaleGender(String gender){
		List<Person> femaleList = dao.getAllFemaleGender(gender);
		femaleList.stream().sorted((p1,p2) ->p1.getAge()+p2.getAge()).collect(Collectors.toList());
		System.out.println(femaleList);
		
		return femaleList;
		
	}
	

}
