package com.learn.post_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.post_service.feignclient.UserServicFeignClient;
import com.learn.post_service.model.UserResponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	UserServicFeignClient userServicFeignClient; 

	@CircuitBreaker(name = "userService", fallbackMethod = "fallBackUserDetailsByUserId")
	public UserResponse getUserDetailsByUserId(Long userId) {
		log.info("getUserDetailsByUserId. userId={}",userId);
		UserResponse resp = userServicFeignClient.getUserDetailsByUserId(userId);
		
		return resp;
	}
	
	public UserResponse fallBackUserDetailsByUserId(Long userId, Throwable th) {
		log.error("Error="+th);
		return new UserResponse();
	}
}
