package com.springrest.springrest.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
    
    public void setPost(Post post) {
        this.post = post;
    }

    
    @ManyToOne
    @JoinColumn(name = "parent_comment_id")
    private Comment parentComment;
    
    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    
    @OneToMany(mappedBy = "parentComment", cascade = CascadeType.ALL)
    private List<Comment> replies;
    
    private String content;
}
