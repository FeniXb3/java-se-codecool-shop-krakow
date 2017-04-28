package com.codecool.shop.dao;

import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoHardcoded implements ProductDao {
    @Override
    public void add(Product product) {
        throw new NotImplementedException();
    }

    @Override
    public Product find(int id) {
        throw new NotImplementedException();
    }

    @Override
    public void remove(int id) {
        throw new NotImplementedException();
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        Product first = new Product("First",
                2.33f,
                "PLN",
                "descr",
                new ProductCategory("Category", "dep", "desc"),
                new Supplier("Supp", "descr")
                );
        first.setId(1);
        Product second = new Product("Second",
                2.33f,
                "PLN",
                "descr",
                new ProductCategory("Category", "dep", "desc"),
                new Supplier("Supp", "descr")
        );

        second.setId(2);
        products.add(first);
        products.add(second);


        return products;
    }

    @Override
    public List<Product> getBy(Supplier supplier) {
        throw new NotImplementedException();
    }

    @Override
    public List<Product> getBy(ProductCategory productCategory) {
        throw new NotImplementedException();
    }
}
