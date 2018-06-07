package com.ucbcba.taller.repositories;


import com.ucbcba.taller.entities.Category;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
