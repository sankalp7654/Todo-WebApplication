package com.sansoft.springboot.web.springbootfirstwebapplication.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("in28Minutes") && password.equalsIgnoreCase("dummy");
	}
}
