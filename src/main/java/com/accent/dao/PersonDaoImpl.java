package com.accent.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.accent.domain.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	//creating the hardcoded data for person
	private static List<Person> dataList = new ArrayList<>();


	@Override
	public List<Person> getAllMaleGender(String gender) {
		List<Person>  listMale = new ArrayList<>();
		if(gender == null) {
			return listMale;
		}
		listMale = dataList.stream()
				.filter(p->p.getGender().equals(gender))
				.collect(Collectors.toList());


		return listMale;
	}


	@Override
	public List<Person> getAllFemaleGender(String gender) {
		List<Person> listFemale = new ArrayList<>();

		if(gender == null){
			return listFemale;
		}
			else {
				listFemale = dataList.stream().filter(p ->p.getGender().equals(gender)).collect(Collectors.toList());
				return listFemale;
			}


			
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
			p3.setAge(26);
			p3.setGender("male");
			p3.setName("shaeb");
			dataList.add(p3);

			Person p5 = new Person();
			p5.setGender("female");
			p5.setName("logon");
			p5.setAge(12);
			dataList.add(p5);

			Person p4 = new Person();
			p4.setAge(26);
			p4.setGender("female");
			p4.setName("preti");
			dataList.add(p4);
			
			
		}


	}
