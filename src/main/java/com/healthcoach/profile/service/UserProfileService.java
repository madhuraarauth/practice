package com.healthcoach.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthcoach.profile.dao.UserProfileDao;
import com.healthcoach.profile.domain.LoginRequest;

@Service
public class UserProfileService {

	@Autowired
	private UserProfileDao dao;
	
	public boolean login(LoginRequest loginRequest ){
		return dao.login(loginRequest.getUsername(), loginRequest.getPassword());
	}
}
