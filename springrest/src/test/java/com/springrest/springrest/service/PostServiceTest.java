package com.springrest.springrest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.springrest.springrest.model.Post;
import com.springrest.springrest.repository.PostRepository;

public class PostServiceTest {

    @Mock
    private PostRepository postRepository;

    @InjectMocks
    private PostService postService;

    @Test
    public void testGetAllPosts() {
        MockitoAnnotations.initMocks(this);
        Post post = new Post();
        post.setTitle("Test Post");
        post.setContent("Test Content");
        when(postRepository.findAll()).thenReturn(Collections.singletonList(post));
        List<Post> posts = postService.getAllPosts();
        assertEquals(1, posts.size());
        assertEquals("Test Post", posts.get(0).getTitle());
    }
}
