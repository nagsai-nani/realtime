package com.it.realtime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.realtime.models.User;
import com.it.realtime.services.UserService;
@RestController
@RequestMapping("/rest/user")

public class UserController {
@Autowired
UserService userService;
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User bean){
		userService.save(bean);
		return ResponseEntity.ok("saved user successfull");
		
	}
	
	
}
