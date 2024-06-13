package com.springrest.springrest.service;

import com.springrest.springrest.model.Comment;
import com.springrest.springrest.model.Post;
import com.springrest.springrest.repository.CommentRepository;
import com.springrest.springrest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    
    @Autowired
    private CommentRepository commentRepository;
    
    @Autowired
    private PostRepository postRepository;
    
    public Comment createComment(Long postId, Comment comment) {
        Post post = postRepository.findById(postId)
            .orElseThrow(() -> new RuntimeException("Post not found"));
        comment.setPost(post);
        return commentRepository.save(comment);
    }
    
    public Comment replyToComment(Long commentId, Comment reply) {
        Comment parentComment = commentRepository.findById(commentId)
            .orElseThrow(() -> new RuntimeException("Comment not found"));
        reply.setParentComment(parentComment);
        return commentRepository.save(reply);
    }
}
