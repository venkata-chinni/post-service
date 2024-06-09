package com.learn.post_service.model;

import lombok.Data;

@Data
public class UserResponse {

	private Long userId;
	
	private String email;
	
	private String name;
}
