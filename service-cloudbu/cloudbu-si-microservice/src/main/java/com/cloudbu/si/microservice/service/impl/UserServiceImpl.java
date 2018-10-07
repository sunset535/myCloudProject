package com.cloudbu.si.microservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cloudbu.common.domain.si.model.User;
import com.cloudbu.common.domain.util.PagedList;
import com.cloudbu.si.microservice.dao.UserMapper;
import com.cloudbu.si.microservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userDao;
	
	@Override
	public int saveUser(User user) {
		return userDao.insert(user);
	}

	public PagedList<User> queryByCondition() {
		return null;
	}
	

}
