package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.accent.domain.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	//creating the hardcoded data for person
	private static List<Person> dataList = new ArrayList<>();

	
	@Override
	public List<Person> getAllMaleGender(String gender) {

		List<Person>  listMale = new ArrayList<>();

		for(Person person : dataList){
			if(person.getGender() == gender){
				listMale.add(person);
			}

		}

		return listMale;
	}


	@Override
	public List<Person> getAllFemaleGender(String gender) {
		List<Person> listFemale = new ArrayList<>();
		
		for(Person person : dataList){
			if(person.getGender() == gender){
				listFemale.add(person);
			}
		}
		return listFemale;
	}
	
	
	static {

		Person p1 = new Person();
		p1.setAge(24);
		p1.setGender("male");
		p1.setName("vikash");
		dataList.add(p1);

		Person p2 = new Person();
		p2.setAge(25);
		p2.setGender("male");
		p2.setName("sahil");
		dataList.add(p2);

		Person p3 = new Person();
		p3.setAge(25);
		p3.setGender("male");
		p3.setName("shaeb");
		dataList.add(p3);
		
		Person p4 = new Person();
		p4.setAge(26);
		p4.setGender("female");
		p4.setName("preti");
	}



}
