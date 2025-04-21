package com.example.api;

import org.testng.annotations.DataProvider;

import java.util.Arrays;
import java.util.List;

public class TestData {

    @DataProvider(name = "products")
    public static Object[][] provideProducts() {
        List<Product> products = Arrays.asList(
                new Product(1, "Product 1", "Description 1", 10.0),
                new Product(2, "Product 2", "Description 2", 20.0),
                new Product(3, "Product 3", "Description 3", 30.0)
        );
        return new Object[][]{{products}};
    }

    @DataProvider(name = "productIds")
    public static Object[][] provideProductIds() {
        List<Integer> productIds = Arrays.asList(1, 2, 3);
        return new Object[][]{{productIds}};
    }
}