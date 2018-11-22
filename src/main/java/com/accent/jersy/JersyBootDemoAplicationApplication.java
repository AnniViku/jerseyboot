package com.accent.jersy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.accent.domain.Person;
import com.accent.service.PersonService;
import com.accent.service.PersonServiceImpl;


@ComponentScan({"com.accent.controller","com.accent.jersy","com.accent.service","com.accent.dao"})
@SpringBootApplication
public class JersyBootDemoAplicationApplication {


	public static void main(String[] args) {

		SpringApplication.run(JersyBootDemoAplicationApplication.class, args);

		
		System.out.println("vikash ....");
	}

}
