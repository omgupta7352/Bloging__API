package com.springrest.springrest.controller;

import com.springrest.springrest.model.Comment;
import com.springrest.springrest.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid; // Import @Valid here

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}")
    public Comment createComment(
            @PathVariable(value = "postId") Long postId,
            @Valid @RequestBody Comment comment) {
        return commentService.createComment(postId, comment);
    }

    @PostMapping("/reply/{commentId}")
    public Comment replyToComment(
            @PathVariable(value = "commentId") Long commentId,
            @Valid @RequestBody Comment reply) {
        return commentService.replyToComment(commentId, reply);
    }
}
