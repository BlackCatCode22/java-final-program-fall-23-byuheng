    // Package declaration indicating the location of the class in the project structure
package com.example.RestAPI.model;

    /* The Product class forms the backbone of this application, defining the structure
    and properties of a product. It's the blueprint for representing a product within
    the application. */
public class Product {

    /* The core elements for this class has four fields.
    These attributes contain the essential properties of a product. */
    private String productId;
    private String productName;
    private String productPrice;
    private String productStock;

    /* This class features two constructors. The default constructor is empty */
    public Product() {

    }

    /* The other is a parameterized constructor. */
    public Product(String productId, String productName, String productPrice, String productStock) {

        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    /* For each attribute, getter and setter methods were generated. */
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
