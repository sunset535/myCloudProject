package com.cloudbu.si.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudbu.common.domain.si.model.User;
import com.cloudbu.common.domain.util.ResponseResult;
import com.cloudbu.common.feign.si.UserServiceClient;

@RestController
@RequestMapping("/mag/si/user")
public class TestController {

	@Autowired
	private UserServiceClient userServiceClient;
	
	@PostMapping("/save")
	public ResponseResult<User> saveUser(@RequestBody User user){
		return userServiceClient.saveUser(user);
	}
}
