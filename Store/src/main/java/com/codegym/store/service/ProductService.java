package com.codegym.store.service;

import com.codegym.store.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService<Product> {
    private Connection connection = ConnectToMySQL.getConnection();

    public ProductService() {
    }

    @Override
    public void add(Product product) {
        String sql = "insert into product(name, price, image) values (? , ?, ?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getImage());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findAll() {
        String sql = "select * from product;";
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id"); // 1
                String name = resultSet.getString("name"); // ca
                double price = resultSet.getDouble("price"); // 200
                String image = resultSet.getString("image"); // ...
                Product product = new Product(id, name, price, image); // product
                list.add(product); // add list
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void edit(int id, Product product) {
        String sql = "update product set name = ?, price = ?, image = ? where id = ?;";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setString(3, product.getImage());
            preparedStatement.setInt(4, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int findIndexById(int id) {
        return -1;
    }

    @Override
    public Product findById(int id) {
        String sql = "select * from product where id = ?;";
        Product product = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                String image = resultSet.getString("image");
                product = new Product(id,name, price, image);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

}
