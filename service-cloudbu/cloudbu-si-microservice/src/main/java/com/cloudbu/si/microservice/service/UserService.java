package com.cloudbu.si.microservice.service;

import com.cloudbu.common.domain.si.model.User;
import com.cloudbu.common.domain.util.PagedList;

public interface UserService {

	public int saveUser(User user);
	
	public PagedList<User> queryByCondition();
}
