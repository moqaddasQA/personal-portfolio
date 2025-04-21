package com.example.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.Arrays;
import java.util.List;

public class ProductApiClient {

  private final String BASE_URL = "http://localhost:3000";
  private final RequestSpecification request;

  public ProductApiClient() {
    RestAssured.baseURI = BASE_URL;
    request = RestAssured.given();
  }

  public List<Product> getProducts() {
    return Arrays.asList(request.get("/api/products")
        .then()
        .statusCode(200)
        .extract()
        .as(Product[].class));
  }

  public Product getProductById(int id) {
    return request.get("/api/products/" + id)
        .then()
        .statusCode(200)
        .extract()
        .as(Product.class);
  }

  public Product createProduct(Product product) {
    return request.contentType(ContentType.JSON)
        .body(product)
        .post("/api/products")
        .then()
        .statusCode(201)
        .extract()
        .as(Product.class);
  }

  public Product updateProduct(int id, Product product) {
    return request.contentType(ContentType.JSON)
        .body(product)
        .put("/api/products/" + id)
        .then()
        .statusCode(200)
        .extract()
        .as(Product.class);
  }

  public void deleteProduct(int id) {
    request.delete("/api/products/" + id)
        .then()
        .statusCode(204);
  }

  // Helper method to check if a product exists (for validation)
  public boolean productExists(int id) {
    try {
      getProductById(id);
      return true; // Product exists
    } catch (Exception e) {
      return false; // Product does not exist or other error
    }
  }
}