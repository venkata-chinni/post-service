package com.learn.post_service.model;

import lombok.Data;

@Data
public class PostResponseModel {

	private Long postId;
	private String post;
	private String likes;
	private String dislikes;
	
	private UserResponse userdetails;
}
