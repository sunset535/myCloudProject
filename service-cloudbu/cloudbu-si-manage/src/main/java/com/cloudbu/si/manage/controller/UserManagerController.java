package com.cloudbu.si.manage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloudbu.common.constant.BusinessCode;
import com.cloudbu.common.domain.si.model.User;
import com.cloudbu.common.domain.util.ResponseResult;
import com.cloudbu.common.feign.si.UserServiceClient;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "后台用户管理", tags = "后台用户管理")
@RequestMapping("/mag/user")
public class UserManagerController {
	
	private static final Logger log = LoggerFactory.getLogger(UserManagerController.class);
	
	@Autowired(required=true)
	private UserServiceClient userServiceClient;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ApiOperation(value = "插入用户操作", notes = "插入用户操作")
	@ApiResponses({ @ApiResponse(code = BusinessCode.CODE_SI_2001, message = "服务器内部错误,插入用户信息失败"),
			@ApiResponse(code = BusinessCode.CODE_OK, message = "操作成功") })
	public ResponseResult<User> getCompanyInfoByPage(@RequestBody User user) {
		log.info("user object:"+user.toString());
		return userServiceClient.saveUser(user);
	}
}
