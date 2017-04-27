package com.codecool.shop;

import com.codecool.shop.controller.ProductController;

public class CodecoolShopApplication {

    public void start() {
        System.out.println("Starting!");

        ProductController productController = new ProductController();
        productController.list();
    }
}
