package com.shoppinglist.shoppinglist.service;

import com.shoppinglist.shoppinglist.model.entities.enums.CategoryName;
import com.shoppinglist.shoppinglist.model.service.ProductServiceModel;
import com.shoppinglist.shoppinglist.model.view.ProductViewModel;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    void add(ProductServiceModel productServiceModel);

    BigDecimal getTotalSum();

    //TODO Тук е правилно да връща ProductServiceModel и на следващото ниво, в Service-а да го map-нем към view model!!!
    List<ProductViewModel> findAllProductsByCategoryName(CategoryName categoryName);
}
