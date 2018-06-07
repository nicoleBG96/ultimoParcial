package com.ucbcba.taller.repositories;

import com.ucbcba.taller.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface RoleRepository extends JpaRepository<Role, Integer> {

}