package com.accent.jersy;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.accent.dao.PersonDaoImpl;
import com.accent.domain.Person;
import com.accent.service.PersonServiceImpl;

public class TestJersyWebApp extends JersyBootDemoAplicationApplicationTests {

	@MockBean
	private PersonDaoImpl dao;

	@Autowired
	private PersonServiceImpl service;

	List<Person> listMale;
	List<Person> listFemale;

	@Before
	public void getListDao(){
		listMale = dao.getAllMaleGender("male");
		listFemale = dao.getAllFemaleGender("female");
	}

	@Test
	public void testJersyDataMale(){

		when(dao.getAllMaleGender("male")).thenReturn(listMale);
		assertEquals(listMale, service.getMaleGender("male"));

	}
	
	@Test
	public void testJersyDataFemale(){
		when(dao.getAllFemaleGender("female")).thenReturn(listFemale);
		assertEquals(listFemale, service.getFemaleGender("female"));
	}
}
