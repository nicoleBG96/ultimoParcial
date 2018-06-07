package com.ucbcba.taller.services;


import com.ucbcba.taller.entities.Category;
import com.ucbcba.taller.entities.Restaurant;
import com.ucbcba.taller.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    @Qualifier(value = "categoryRepository")
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Iterable<Category> listAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public Category getCategory(Integer id) {
        return categoryRepository.findOne(id);
    }

    @Override
    public void deleteCategory(Integer id) {
       categoryRepository.delete(id);
    }

}
