package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.Category;
import com.ucbcba.taller.entities.Restaurant;

import java.util.List;

public interface CategoryService {
    Iterable<Category> listAllCategories();

    void saveCategory(Category category);

    Category getCategory(Integer id);

    void deleteCategory (Integer id);


}
