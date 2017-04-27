package com.codecool.shop.dao;

import com.codecool.shop.model.Product;
import com.codecool.shop.model.ProductCategory;
import com.codecool.shop.model.Supplier;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoHardcoded implements ProductDao {

    private List<Product> products;

    public ProductDaoHardcoded() {
        products = new ArrayList<>();
        ProductCategory first = new ProductCategory("Category",
                "Department",
                "Category description"
        );
        first.setId(1);
        ProductCategory second = new ProductCategory("Another Category",
                "Department",
                "Category description"
        );
        second.setId(2);

        products.add(new Product("First",
                1.0f,
                "PLN",
                "First description",
                first,
                new Supplier("First Supplier", "Description")
        ));
        products.add(new Product("Second",
                1.0f,
                "PLN",
                "Second description",
                second,
                new Supplier("Second Supplier", "Description")
        ));
    }

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
        return products;
    }

    @Override
    public List<Product> getBy(Supplier supplier) {
        throw new NotImplementedException();
    }

    @Override
    public List<Product> getBy(ProductCategory productCategory) {
        List<Product> filteredProducts = new ArrayList<>();
        for(Product product:products) {
            if(product.getProductCategory().getId() == productCategory.getId()) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }
}
