package com.codegym.store.service;

import com.codegym.store.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService<Product> {
    private List<Product> productList = new ArrayList<>();

    public ProductService() {
        this.productList.add(new Product(1, "Bánh mì", 7000, "https://duhocsunny.edu.vn/wp-content/uploads/2023/02/Anh-Gai-xinh-Han-Quoc-Go-Youn-Jung.jpg"));
        productList.add(new Product(2, "Bánh kẹo", 7000.5, "https://duhocsunny.edu.vn/wp-content/uploads/2023/02/Anh-Gai-xinh-Han-Quoc-Go-Youn-Jung.jpg"));
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void edit(int id, Product product) {
        int index = findIndexById(id);
        productList.set(index, product);
    }

    @Override
    public void delete(int id) {
        int index = findIndexById(id);
        productList.remove(index);
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Product findById(int id) {
        int index = findIndexById(id);
        return productList.get(index);
    }

}
