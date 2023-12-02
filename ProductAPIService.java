// Package declaration indicating the location of the class in the project structure
package com.example.RestAPI.model.controller;

// Importing necessary classes for the controller
import com.example.RestAPI.model.Product;
import org.springframework.web.bind.annotation.*;

// Annotation indicating that this class is a REST controller
@RestController
// Base mapping for all endpoints in this controller with URL path
@RequestMapping("/product")
public class ProductAPIService {

    // Instance variable to hold product details
    Product product;

    /*This Spring annotation handle GET requests to the "/product/{productId}" endpoint, where
    {productId} is a placeholder for a specific product ID. The method takes the productId as a
    path variable, and it returns the details of the product corresponding to that ID, or null
    if the product details haven't been set or found.*/
    @GetMapping("{productId}")
    public Product getProductAPIDetails(@PathVariable String productId) {
        return product;

    }

    /*This method is a controller endpoint that handles HTTP POST requests to create or update
      product details. It takes a Product object in the request body, assigns it to the
      class-level product variable, and then returns a success message.*/
    @PostMapping
    public String createProductDetails(@RequestBody Product product) {
        this.product = product;
        // Return a success message
        return "Product Created Successfully";

    }

    /*HTTP PUT handle requests to update product details. It takes a Product object in the request
      body, assigns it to the class-level product variable, and then returns a success message.*/
    @PutMapping
    public String updateProductDetails(@RequestBody Product product) {
        this.product = product;
        // Return a success message
        return "Product Updated Successfully";

    }

    /*This controller endpoint handles HTTP DELETE requests to delete product details. It takes a
      productId as a path variable, sets the class-level product variable to null effectively simulating
      the deletion of the product, and then returns a success message.*/
    @DeleteMapping("{productId}")
    public String deleteProductDetails(@PathVariable String productId) {
        this.product = null;
        // Return a success message
        return "Product Deleted Successfully";

    }

}
