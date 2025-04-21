package com.example.api;

import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.assertj.core.api.Assertions;
import java.util.List;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class ProductApiTest {

    private ProductApiClient productApiClient;

    @BeforeClass
    public void setup() {
        productApiClient = new ProductApiClient();
    }

    @Test
    public void testGetProducts() {
        try {
            List<Product> products = productApiClient.getProducts();
            Assertions.assertThat(products).isNotNull();
            
        } catch (Exception e) {
            Assertions.fail("Failed to get products", e);
        }
    }

    @Test
    public void testGetProductById() {
        try {
            // Assuming there's at least one product to fetch
            List<Product> products = productApiClient.getProducts();
            Assertions.assertThat(products).isNotEmpty();
            Product firstProduct = products.get(0);

            Product product = productApiClient.getProductById(firstProduct.getId());
            Assertions.assertThat(product).isNotNull();
            Assertions.assertThat(product.getId()).isEqualTo(firstProduct.getId());
        } catch (Exception e) {
            Assertions.fail("Failed to get product by ID", e);
        }
    }

    @Test
    public void testCreateProduct() {
        try {
            Product newProduct = new Product();
            newProduct.setName("Test Product");
            newProduct.setDescription("Test Description");
            newProduct.setPrice(99.99);
            Product createdProduct = productApiClient.createProduct(newProduct);
            Assertions.assertThat(createdProduct).isNotNull();
            Assertions.assertThat(createdProduct.getName()).isEqualTo(newProduct.getName());
        } catch (Exception e) {
            Assertions.fail("Failed to create product", e);
        }
    }

    @Test
    public void testUpdateProduct() {
        try {
            // Assuming there's at least one product to update
            List<Product> products = productApiClient.getProducts();
             Assertions.assertThat(products).isNotEmpty();
            Product firstProduct = products.get(0);

            Product updatedProduct = new Product();
            updatedProduct.setName("Updated Product");
            updatedProduct.setDescription("Updated Description");
            updatedProduct.setPrice(199.99);

            Product result = productApiClient.updateProduct(firstProduct.getId(), updatedProduct);

             Assertions.assertThat(result).isNotNull();
             Assertions.assertThat(result.getName()).isEqualTo(updatedProduct.getName());
            
        } catch (Exception e) {
            Assertions.fail("Failed to update product", e);
        }
    }

    @Test
    public void testDeleteProduct() {
        try {
            // Assuming there's at least one product to delete
            List<Product> products = productApiClient.getProducts();
            Assertions.assertThat(products).isNotEmpty();
            Product firstProduct = products.get(0);
             
            Response response = productApiClient.deleteProduct(firstProduct.getId());
            Assertions.assertThat(response.getStatusCode()).isIn(200, 204);

        } catch (Exception e) {
            Assertions.fail("Failed to delete product", e);
        }
    }
    @Test
    public void testGetNonExistentProduct() {
        try {
            Product product = productApiClient.getProductById(-1);
            Assertions.assertThat(product).isNull();
        } catch (Exception e) {
            Assertions.fail("Failed to handle non-existent product", e);
        }
    }

    @Test
    public void testCreateProductWithInvalidData() {
      try{
            Product invalidProduct = new Product();
            invalidProduct.setName("");
            invalidProduct.setDescription("Test Description");
            invalidProduct.setPrice(-10.0);
            Product createdProduct = productApiClient.createProduct(invalidProduct);
            Assertions.assertThat(createdProduct).isNull();
      } catch (Exception e) {
            Assertions.fail("Failed to create invalid product", e);
        }

    }
}