package com.accent.controller;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfiguration extends ResourceConfig{
	
	public JerseyConfiguration() {
		
		register(PersonResource.class);
	}
}
