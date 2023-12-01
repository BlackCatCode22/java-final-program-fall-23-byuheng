package com.example.RestAPI.model;

public class ProductVendor {

    // Private fields to store information about the product
    private String productId;      // Unique identifier for the product
    private String productName;    // Name of the product
    private String productPrice;   // Price of the product
    private String productStock;   // Current stock quantity of the product

    // Default constructor, used when an object is created without providing initial values
    public ProductVendor() {
    }

    // Parameterized constructor, used when an object is created with specific values
    public ProductVendor(String productId, String productName, String productPrice, String productStock) {

        // Assigning values passed as parameters to the corresponding fields
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;

    }

    // Generate Getter and Setter methods for the identifiers
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
