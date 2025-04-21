package com.example.api;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.List;
import org.json.JSONObject;

public class ProductApiTests {

    private ProductApiClient productApiClient;

    @BeforeClass
    public void setUp() {
        productApiClient = new ProductApiClient();
    }

    @Test
    public void getAllProductsTest() {
        Response response = productApiClient.getAllProducts();
        Assert.assertEquals(response.getStatusCode(), 200);
        List<Product> products = response.jsonPath().getList(".", Product.class);
        Assert.assertFalse(products.isEmpty());
    }

    @Test
    public void getProductByIdTest() {
        int productId = 1;
        Response response = productApiClient.getProductById(productId);
        Assert.assertEquals(response.getStatusCode(), 200);
        Product product = response.as(Product.class);
        Assert.assertEquals(product.getId(), productId);
    }

    @Test
    public void createProductTest() {
        Product newProduct = new Product();
        newProduct.setName("Test Product");
        newProduct.setDescription("This is a test product");
        newProduct.setPrice(99.99);

        Response response = productApiClient.createProduct(newProduct);
        Assert.assertEquals(response.getStatusCode(), 201);

        Product createdProduct = response.as(Product.class);
        Assert.assertEquals(createdProduct.getName(), newProduct.getName());
        Assert.assertEquals(createdProduct.getDescription(), newProduct.getDescription());
        Assert.assertEquals(createdProduct.getPrice(), newProduct.getPrice());
    }
    @Test
    public void updateProductTest() {
        // First, create a product to update
        Product newProduct = new Product();
        newProduct.setName("Test Product");
        newProduct.setDescription("This is a test product");
        newProduct.setPrice(99.99);

        Response createResponse = productApiClient.createProduct(newProduct);
        Assert.assertEquals(createResponse.getStatusCode(), 201);

        Product createdProduct = createResponse.as(Product.class);
        int productIdToUpdate = createdProduct.getId();

        // Now update the product
        Product updatedProduct = new Product();
        updatedProduct.setName("Updated Test Product");
        updatedProduct.setDescription("This product has been updated");
        updatedProduct.setPrice(149.99);

        Response updateResponse = productApiClient.updateProduct(productIdToUpdate, updatedProduct);
        Assert.assertEquals(updateResponse.getStatusCode(), 200);

        Product productAfterUpdate = updateResponse.as(Product.class);
        Assert.assertEquals(productAfterUpdate.getName(), updatedProduct.getName());
        Assert.assertEquals(productAfterUpdate.getDescription(), updatedProduct.getDescription());
        Assert.assertEquals(productAfterUpdate.getPrice(), updatedProduct.getPrice());
    }

    @Test
    public void deleteProductTest() {
          // First, create a product to delete
        Product newProduct = new Product();
        newProduct.setName("Test Product");
        newProduct.setDescription("This is a test product");
        newProduct.setPrice(99.99);

        Response createResponse = productApiClient.createProduct(newProduct);
        Assert.assertEquals(createResponse.getStatusCode(), 201);

        Product createdProduct = createResponse.as(Product.class);
        int productIdToDelete = createdProduct.getId();

        // Now delete the product
        Response response = productApiClient.deleteProduct(productIdToDelete);
        Assert.assertEquals(response.getStatusCode(), 200);
        
           Response getResponse = productApiClient.getProductById(productIdToDelete);
        Assert.assertEquals(getResponse.getStatusCode(), 404);
    }

        private String createProductJson(String name, String description, double price) {
        JSONObject productJson = new JSONObject();
        productJson.put("name", name);
        productJson.put("description", description);
        productJson.put("price", price);
        return productJson.toString();
    }
}