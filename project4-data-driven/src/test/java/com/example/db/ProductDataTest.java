package com.example.db;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductDataTest {

    private DBUtils dbUtils;
    private Connection connection;

    @BeforeClass
    public void setUp() {
        dbUtils = new DBUtils();
        connection = dbUtils.getConnection();
    }

    @AfterClass
    public void tearDown() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testProductCount() throws SQLException {
        String query = "SELECT COUNT(*) FROM Products";
        ResultSet resultSet = dbUtils.executeSelectQuery(query);
        resultSet.next();
        int count = resultSet.getInt(1);
        assertThat(count).isGreaterThanOrEqualTo(0);
    }

    @Test
    public void testProductDataIntegrity() throws SQLException {
        String query = "SELECT * FROM Products";
        ResultSet resultSet = dbUtils.executeSelectQuery(query);
        List<Product> products = new ArrayList<>();
        while (resultSet.next()) {
            Product product = new Product(
                    resultSet.getInt("product_id"),
                    resultSet.getString("name"),
                    resultSet.getString("description"),
                    resultSet.getDouble("price")
            );
            products.add(product);
        }
        for (Product product : products) {
            assertThat(product.getPrice()).isGreaterThanOrEqualTo(0.0);
        }
    }

    @Test
    public void testAddProduct() throws SQLException {
        String insertQuery = "INSERT INTO Products (product_id, name, description, price) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setInt(1, 10);
            preparedStatement.setString(2, "Test Product");
            preparedStatement.setString(3, "This is a test product");
            preparedStatement.setDouble(4, 99.99);
            int rowsAffected = preparedStatement.executeUpdate();
            assertThat(rowsAffected).isEqualTo(1);
        }
    }

    @Test
    public void testUpdateProduct() throws SQLException {
        String updateQuery = "UPDATE Products SET price = ? WHERE product_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setDouble(1, 199.99);
            preparedStatement.setInt(2, 10);
            int rowsAffected = preparedStatement.executeUpdate();
            assertThat(rowsAffected).isEqualTo(1);
        }
    }

    @Test
    public void testDeleteProduct() throws SQLException {
        String deleteQuery = "DELETE FROM Products WHERE product_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, 10);
            int rowsAffected = preparedStatement.executeUpdate();
            assertThat(rowsAffected).isEqualTo(1);
        }
    }
}

class Product {
    private int productId;
    private String name;
    private String description;
    private double price;

    public Product(int productId, String name, String description, double price) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}