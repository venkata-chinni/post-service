package com.learn.post_service.service;

import com.learn.post_service.model.PostResponseModel;

public interface PostService {

	PostResponseModel getPostInfoByPostId(Long postId);

}
