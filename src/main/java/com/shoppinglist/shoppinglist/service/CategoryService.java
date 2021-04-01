package com.shoppinglist.shoppinglist.service;

import com.shoppinglist.shoppinglist.model.entities.Category;
import com.shoppinglist.shoppinglist.model.entities.enums.CategoryName;

public interface CategoryService {
    void initCategories();

    Category findByName(CategoryName categoryName);
}
