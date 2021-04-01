package com.shoppinglist.shoppinglist.repository;

import com.shoppinglist.shoppinglist.model.entities.Category;
import com.shoppinglist.shoppinglist.model.entities.enums.CategoryName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {
    Optional<Category> findByName(CategoryName name);
}
