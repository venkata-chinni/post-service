package com.learn.post_service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.post_service.model.PostResponseModel;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostServiceImpl implements PostService {

	
//	private static final Logger log = LoggerFactory.getLogger(PostServiceImpl.class);
	
	@Autowired
	UserService userService;

	@Override
	public PostResponseModel getPostInfoByPostId(Long postId) {
		log.info("get postInfo. postId={}", postId);
		
		PostResponseModel post = new PostResponseModel();
		post.setPostId(postId);
		post.setPost("Hello!!");
		post.setLikes("1");
		post.setDislikes("2");
		post.setUserdetails(userService.getUserDetailsByUserId(postId));
		
		return post;
	}
	
	

}
