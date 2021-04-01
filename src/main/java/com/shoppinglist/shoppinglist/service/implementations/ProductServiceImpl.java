package com.shoppinglist.shoppinglist.service.implementations;

import com.shoppinglist.shoppinglist.model.entities.Product;
import com.shoppinglist.shoppinglist.model.entities.enums.CategoryName;
import com.shoppinglist.shoppinglist.model.service.ProductServiceModel;
import com.shoppinglist.shoppinglist.model.view.ProductViewModel;
import com.shoppinglist.shoppinglist.repository.ProductRepository;
import com.shoppinglist.shoppinglist.service.CategoryService;
import com.shoppinglist.shoppinglist.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final CategoryService categoryService;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, CategoryService categoryService, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void add(ProductServiceModel productServiceModel) {
        Product product = modelMapper.map(productServiceModel, Product.class);

        product.setCategory(categoryService.findByName(productServiceModel.getCategory()));

        productRepository.save(product);
    }

    @Override
    public BigDecimal getTotalSum() {
        return productRepository
                .findTotalProductsSum();
    }

    @Override
    public List<ProductViewModel> findAllProductsByCategoryName(CategoryName categoryName) {

        return productRepository.findAllByCategory_Name(categoryName)
                .stream().map(product -> modelMapper.map(product, ProductViewModel.class))
                .collect(Collectors.toList());
    }
}
