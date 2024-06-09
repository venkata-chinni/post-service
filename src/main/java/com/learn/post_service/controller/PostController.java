package com.learn.post_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.post_service.model.PostResponseModel;
import com.learn.post_service.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
 
	@Autowired
	PostService postService;
	
	@GetMapping("/{postId}")
	public PostResponseModel getPostDetails(@PathVariable("postId") Long postId) {
		return postService.getPostInfoByPostId(postId);
	}
}
