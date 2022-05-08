package com.in28minutes.springboot.web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		return validateCredentials(userid, password);
	}

	private boolean validateCredentials(String userid, String password) {
		HashMap<String, String> credentials = new HashMap<>();
		credentials.put("Dhoni", "Helicopter");
		credentials.put("Bravo", "Dance");
		credentials.put("Jadeja", "SwordKing");
		if (credentials.containsKey(userid)) {
			String userPassword = credentials.get(userid);
			if (password.equalsIgnoreCase(userPassword)) {
				return Boolean.TRUE;
			}
			return Boolean.FALSE;
		}
		return Boolean.FALSE;
	}


}
