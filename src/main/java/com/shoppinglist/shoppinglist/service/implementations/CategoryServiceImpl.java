package com.shoppinglist.shoppinglist.service.implementations;

import com.shoppinglist.shoppinglist.model.entities.Category;
import com.shoppinglist.shoppinglist.model.entities.enums.CategoryName;
import com.shoppinglist.shoppinglist.repository.CategoryRepository;
import com.shoppinglist.shoppinglist.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void initCategories() {
        if (categoryRepository.count() == 0) {
            Arrays.stream(CategoryName.values())
                    .forEach(categoryName -> {
                        Category category = new Category(categoryName, "Description for " + categoryName.name());

                        categoryRepository.save(category);
                    });
        }
    }
}
