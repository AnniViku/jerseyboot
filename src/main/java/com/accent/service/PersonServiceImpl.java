package com.accent.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accent.domain.Person;
import com.nt.dao.PersonDao;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDao dao;


	@Override
	public List<Person> getMaleGender(String gender) {
		List<Person> maleList = dao.getAllMaleGender(gender);

		Stream<Person> stream = maleList.stream();
		
		
		return maleList;
	}

}
