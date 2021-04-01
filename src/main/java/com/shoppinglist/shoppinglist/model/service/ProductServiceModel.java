package com.shoppinglist.shoppinglist.model.service;

import com.shoppinglist.shoppinglist.model.entities.Category;
import com.shoppinglist.shoppinglist.model.entities.enums.CategoryName;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductServiceModel {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime neededBefore;
    private CategoryName category;

    public ProductServiceModel() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getNeededBefore() {
        return this.neededBefore;
    }

    public void setNeededBefore(LocalDateTime neededBefore) {
        this.neededBefore = neededBefore;
    }

    public CategoryName getCategory() {
        return this.category;
    }

    public void setCategory(CategoryName category) {
        this.category = category;
    }
}
