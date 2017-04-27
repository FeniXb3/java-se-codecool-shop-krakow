package com.codecool.shop.controller;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductCategoryDaoHardcoded;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.ProductDaoHardcoded;
import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;
import com.codecool.shop.view.ProductByCategoryListView;
import com.codecool.shop.view.ProductListView;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductController {
    private final ProductDao dao;
    private ProductListView listView = new ProductListView();
    private ProductByCategoryListView listByCategoryView = new ProductByCategoryListView();

    public ProductController(ProductDao dao) {
        this.dao = dao;
    }

    public void list() {
        List<Product> products = dao.getAll();

        listView.setModel(products);
        listView.render();
    }

    public void listByCategory(int categoryId) {
        ProductCategoryDao categoryDao = new ProductCategoryDaoHardcoded();
        ProductCategory category = categoryDao.find(categoryId);
        List<Product> products = dao.getBy(category);

        listByCategoryView.setModel(products);
        listByCategoryView.render();
    }
}
