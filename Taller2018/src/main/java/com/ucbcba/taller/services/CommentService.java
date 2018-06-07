package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.Comment;

public interface CommentService {
    Iterable<Comment> listAllComments();

    void saveComment(Comment comment);

    Comment getComment(Integer id);

    void deleteComment(Integer id);
}
