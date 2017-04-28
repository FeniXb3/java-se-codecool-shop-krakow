package com.codecool.shop.controller;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.model.Product;
import com.codecool.shop.view.ProductListView;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductController {


    public void listAction() {
        List<Product> products = new ArrayList<>();
        ProductListView productListView = new ProductListView();
        productListView.setModel(products);
        productListView.render();
    }
}
