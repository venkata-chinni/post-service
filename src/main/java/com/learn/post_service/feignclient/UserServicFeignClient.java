package com.learn.post_service.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learn.post_service.model.UserResponse;

@FeignClient(value = "api-gateway")
public interface UserServicFeignClient {

	@GetMapping("/user-service/user/user-post/{userId}")
	UserResponse getUserDetailsByUserId(@PathVariable("userId") Long userId);

	
}
