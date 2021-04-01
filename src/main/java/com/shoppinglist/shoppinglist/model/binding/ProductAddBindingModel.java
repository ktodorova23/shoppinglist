package com.shoppinglist.shoppinglist.model.binding;

import com.shoppinglist.shoppinglist.model.entities.enums.CategoryName;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductAddBindingModel {
    private String name;
    private String description;
    private LocalDateTime neededBefore;
    private BigDecimal price;
    private CategoryName category;

    public ProductAddBindingModel() {
    }

    @Size(min = 3, max = 20, message = "Name must be between 3 and 20 characters long")
    @NotBlank(message = "Name cannot be empty")
    @Column(unique = true)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Size(min = 5, message = "Description must be minimum of 5 characters")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    @FutureOrPresent(message = "The date cannot be in the past")
    public LocalDateTime getNeededBefore() {
        return this.neededBefore;
    }

    public void setNeededBefore(LocalDateTime neededBefore) {
        this.neededBefore = neededBefore;
    }

    @DecimalMin(value = "0", message = "Price must be a positive number")
    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @NotNull(message = "You must select the category from the dropdown")
    public CategoryName getCategory() {
        return this.category;
    }

    public void setCategory(CategoryName category) {
        this.category = category;
    }
}
