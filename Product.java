// Package declaration indicating the location of the class in the project structure
package com.example.RestAPI.model;

// Class representing a product in the application
public class Product {

    // Fields (attributes) representing the properties of a product
    private String productId;
    private String productName;
    private String productPrice;
    private String productStock;

    // Default constructor is empty, allowing the creation of an instance with default values
    public Product() {

    }

    // Parameterized constructor to initialize the fields with provided values
    public Product(String productId, String productName, String productPrice, String productStock) {

        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    // Generate Getter and Setter methods for each attribute
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductStock() {
        return productStock;
    }
    public void setProductStock(String productStock) {
        this.productStock = productStock;

    }

}
