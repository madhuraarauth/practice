package com.healthcoach.profile.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthcoach.profile.domain.LoginRequest;
import com.healthcoach.profile.domain.LoginResponse;
import com.healthcoach.profile.service.UserProfileService;

@RestController
public class UserProfileController {

	@Autowired
	private UserProfileService service;
	
	@RequestMapping(path="/greet", method=RequestMethod.GET)
	public String greet(){
		return "Welcome";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public LoginResponse login(@RequestBody LoginRequest loginRequest){
		LoginResponse loginResponse = new LoginResponse();
		loginResponse.setMessage("Failure");
		if(service.login(loginRequest)){
			loginResponse.setMessage("Success");
		}
		
		return loginResponse;
	}
	
	
}
