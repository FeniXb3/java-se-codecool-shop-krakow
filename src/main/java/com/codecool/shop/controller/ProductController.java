package com.codecool.shop.controller;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.ProductDaoHardcoded;
import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;
import com.codecool.shop.view.ProductListView;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductController {
    private final ProductDao dao;
    private ProductListView listView = new ProductListView();

    public ProductController(ProductDao dao) {
        this.dao = dao;
    }

    public void list() {
        List<Product> products = dao.getAll();

        listView.setModel(products);
        listView.render();
    }
}
