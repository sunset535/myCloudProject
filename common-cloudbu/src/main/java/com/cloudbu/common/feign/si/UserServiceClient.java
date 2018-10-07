package com.cloudbu.common.feign.si;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloudbu.common.constant.BusinessCode;
import com.cloudbu.common.constant.ServiceName;
import com.cloudbu.common.domain.si.model.User;
import com.cloudbu.common.domain.util.ResponseResult;

import feign.hystrix.FallbackFactory;

@FeignClient(value = ServiceName.SI_MICROSERVICE_SERVICE, fallbackFactory = UserServiceFallback.class)
public interface UserServiceClient {

	@RequestMapping(value = "/user/save", method = RequestMethod.POST)
	ResponseResult<User> saveUser(User user);
}
@Component
class UserServiceFallback implements UserServiceClient, FallbackFactory<UserServiceClient> {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceClient.class);
    private Throwable throwable;

    public UserServiceFallback() {
    	
    }

    private UserServiceFallback(Throwable throwable) {
        this.throwable = throwable;
    }

	@Override
	public UserServiceClient create(Throwable arg0) {
		return new UserServiceFallback(throwable);
	}


	@Override
	public ResponseResult<User> saveUser(User user) {
		logger.error("UserServiceClient -> saveUser", throwable);
		return new ResponseResult<>(BusinessCode.CODE_1001);
	}
	
}
