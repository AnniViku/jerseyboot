package com.accent.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.accent.domain.Person;
import com.accent.service.PersonService;
import com.sun.research.ws.wadl.Application;

@Path("/person")
public class PersonResource {


	@Autowired
	private PersonService service;

	@GET
	@Path("/{gender}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getSortedDataMale(@PathParam("gender") String gender){

		if(gender == null)
			new NullPointerException("Gender value is null pls give the value::");

		List<Person> personList = service.getMaleGender(gender);
		return personList;


	}

}
