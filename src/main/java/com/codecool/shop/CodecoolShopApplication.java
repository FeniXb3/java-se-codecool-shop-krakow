package com.codecool.shop;

import com.codecool.shop.controller.ProductController;
import com.codecool.shop.dao.ProductDao;
import com.codecool.shop.dao.ProductDaoHardcoded;

public class CodecoolShopApplication {

    public void start() {
        System.out.println("Starting!");

        //TODO: create and use DAO that loads data from db
        ProductDao productDao = new ProductDaoHardcoded();

        ProductController productController = new ProductController(productDao);
        productController.list();
    }
}
