package com.springrest.springrest.controller;

import com.springrest.springrest.model.Post;
import com.springrest.springrest.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    
    @Autowired
    private PostService postService;
    
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }
    
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
}

