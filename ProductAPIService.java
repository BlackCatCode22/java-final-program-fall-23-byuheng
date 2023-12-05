// Package declaration indicating the location of the class in the project structure
package com.example.RestAPI.model.controller;

// Importing necessary classes for the controller
import com.example.RestAPI.model.Product;
import org.springframework.web.bind.annotation.*;

/* This controller class manages the Product API within the RestAPI application. The
ProductAPIService controller class plays a vital role in managing and responding to various
HTTP requests for this RestAPI application. */

/* The RestController annotation indicating that this class is a REST controller. This provides a
centralized entry point that controls and manages Web request handling. */
@RestController

/* RequestMapping annotation establishes a base mapping for all endpoints in this controller
with the URL path /product. */
@RequestMapping("/product")

public class ProductAPIService {

    /* The instance variable Product product; holds product details, acting as a temporary storage
    within the controller. */
    Product product;

    /*There are four request method that will be implemented here */

    /* GetMapping is a Spring annotation that handles GET requests to the "/product/{productId}" endpoint,
    where {productId} is a placeholder for a specific product ID. The method takes the productId as a
    path variable, and it returns the details of the product corresponding to that ID, or null if the
    product details haven't been set or found. */
    @GetMapping("{productId}")
    public Product getProductAPIDetails(@PathVariable String productId) {

        return product;

    }

    /* PostMapping method is a controller endpoint that handles HTTP POST requests to create or update
    product details. It takes a Product object in the request body, assigns it to the class-level product
    variable, and then returns a success message. */
    @PostMapping
    public String createProductDetails(@RequestBody Product product) {

        this.product = product;

        return "Product Created Successfully";

    }

    /* PutMapping handles HTTP PUT requests to update product details. It takes a Product object in the
    request body, assigns it to the class-level product variable, and then returns a success message. */
    @PutMapping
    public String updateProductDetails(@RequestBody Product product) {

        this.product = product;

        return "Product Updated Successfully";

    }

    /* Lastly, DeleteMapping controller endpoint handles HTTP DELETE requests to delete product details.
    It takes a productId as a path variable, sets the class-level product variable to null effectively
    simulating the deletion of the product, and then returns a success message. */
    @DeleteMapping("{productId}")
    public String deleteProductDetails(@PathVariable String productId) {

        this.product = null;

        return "Product Deleted Successfully";

    }

}
