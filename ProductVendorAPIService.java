package com.example.RestAPI.controller;

import com.example.RestAPI.model.ProductVendor;
import org.springframework.web.bind.annotation.*;

// Controller class for handling ProductVendor-related API requests
@RestController
@RequestMapping("/productvendor")  // Base URL path for this controller
public class ProductVendorAPIService {

    // Instance variable to store ProductVendor details
    ProductVendor productVendor;

    // HTTP GET request to retrieve ProductVendor details by productId
    @GetMapping("{productId}")
    public ProductVendor getProductVendorDetails(@PathVariable String productId) {
        // Returns the current ProductVendor details (in-memory representation)
        return productVendor;
//                new ProductVendor("A1", "Product 1",
//                "xxxx", "xxxx");
    }
    // HTTP POST request to create new ProductVendor details
    @PostMapping
    public String createProductVendorDetails(@RequestBody ProductVendor productVendor) {
        // Assigns the provided ProductVendor details to the instance variable
        this.productVendor = productVendor;
        return "Product Created Successfully";

    }

    // HTTP PUT request to update existing ProductVendor details
    @PutMapping
    public String updateProductVendorDetails(@RequestBody ProductVendor productVendor) {
        // Assigns the provided ProductVendor details to the instance variable
        this.productVendor = productVendor;
        return "Product Updated Successfully";

    }

    // HTTP DELETE request to delete ProductVendor details by productId
    @DeleteMapping("{productId}")
    public String deleteProductVendorDetails(@PathVariable String productId) {
        // Sets the ProductVendor details to null, effectively "deleting" the product
        this.productVendor = null;
        return "Product Deleted Successfully";

    }

}
