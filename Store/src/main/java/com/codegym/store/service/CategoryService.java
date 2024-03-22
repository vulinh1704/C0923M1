package com.codegym.store.service;

import com.codegym.store.model.Category;
import com.codegym.store.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    private Connection connection = ConnectToMySQL.getConnection();

    public List<Category> findAll() {
        String sql = "select * from category";
        List<Category> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id"); // 1
                String name = resultSet.getString("name"); // ca
                Category category = new Category(id, name);
                list.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
