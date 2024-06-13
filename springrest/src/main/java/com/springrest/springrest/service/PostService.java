package com.springrest.springrest.service;

import com.springrest.springrest.model.Post;
import com.springrest.springrest.repository.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public

class PostService {
    
    @Autowired
    private PostRepository postRepository;
    
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
    
    public Post createPost(Post post) {
        return postRepository.save(post);
    }
}
