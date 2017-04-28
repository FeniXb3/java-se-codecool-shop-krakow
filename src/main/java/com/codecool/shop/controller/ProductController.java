package com.codecool.shop.controller;

import com.codecool.shop.dao.ProductCategoryDao;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.ProductDaoHardcoded;
import com.codecool.shop.model.Product;
import com.codecool.shop.view.ProductListView;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductController {


    public void listAction() {
        ProductListView productListView = new ProductListView();

        ProductDao dao = new ProductDaoHardcoded();
        List<Product> products = dao.getAll();

        productListView.setModel(products);
        productListView.render();
    }
}
