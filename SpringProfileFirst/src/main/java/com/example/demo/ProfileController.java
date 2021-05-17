package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping(path="/profile")
	public String getPort()
	{
		return environment.getProperty("local.server.port");
	}
	

}
