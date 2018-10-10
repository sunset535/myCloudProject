package com.cloudbu.si.microservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloudbu.common.constant.BusinessCode;
import com.cloudbu.common.domain.si.model.User;
import com.cloudbu.common.domain.util.ResponseResult;
import com.cloudbu.common.exception.BusinessException;
import com.cloudbu.common.feign.si.UserServiceClient;
import com.cloudbu.si.microservice.service.UserService;

@RestController
public class UserController implements UserServiceClient{
	
	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@Override
	public ResponseResult<User> saveUser(@RequestBody User user) {
		log.info("user object: "+user.toString());
		
		ResponseResult<User> result = new ResponseResult<>();
		int saveResult = userService.saveUser(user);
		if(saveResult==1) {
			result.setData(user);
		}else {
			throw new BusinessException(BusinessCode.CODE_SI_2001);
		}
		return result;
	}

	

}
