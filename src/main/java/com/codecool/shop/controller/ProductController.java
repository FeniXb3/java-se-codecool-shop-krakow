package com.codecool.shop.controller;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;
import com.codecool.shop.view.ProductListView;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductController {
    private ProductListView listView = new ProductListView();

    public void list() {
        //TODO: get products from DAO
        List<Product> products = new ArrayList<>();
        products.add(new Product("First",
                1.0f,
                "PLN",
                "First description",
                new ProductCategory("Category",
                        "Department",
                        "Category description"
                ),
                new Supplier("First Supplier", "Description")
        ));
        products.add(new Product("Second",
                1.0f,
                "PLN",
                "Second description",
                new ProductCategory("Another Category",
                        "Department",
                        "Category description"
                ),
                new Supplier("Second Supplier", "Description")
        ));

        listView.setModel(products);
        listView.render();
    }
}
