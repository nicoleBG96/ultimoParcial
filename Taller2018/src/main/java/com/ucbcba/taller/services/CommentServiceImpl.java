package com.ucbcba.taller.services;


import com.ucbcba.taller.entities.Comment;
import com.ucbcba.taller.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepository;

    @Autowired
    @Qualifier(value = "commentRepository")
    public void setCommentRepository(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Iterable<Comment> listAllComments() {return commentRepository.findAll();  }

    @Override
    public void saveComment(Comment comment) {commentRepository.save(comment); }

    @Override
    public Comment getComment(Integer id) {return commentRepository.findOne(id); }

    @Override
    public void deleteComment(Integer id) {commentRepository.delete(id); }
}
