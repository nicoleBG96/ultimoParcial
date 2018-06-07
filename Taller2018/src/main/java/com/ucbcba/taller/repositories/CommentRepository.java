package com.ucbcba.taller.repositories;

import com.ucbcba.taller.entities.Comment;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
