package com.ucbcba.taller.repositories;

import com.ucbcba.taller.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}