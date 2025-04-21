package com.example.db;

import java.sql.*;

public class DBUtils {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            throw new SQLException("Failed to connect to the database", e);
        }
    }

    public static ResultSet executeSelectQuery(String query) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException e) {
            throw new SQLException("Failed to execute select query: " + query, e);
        }
    }

    public static int executeUpdateQuery(String query) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            return statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new SQLException("Failed to execute update query: " + query, e);
        } finally {
           
        }
    }
}