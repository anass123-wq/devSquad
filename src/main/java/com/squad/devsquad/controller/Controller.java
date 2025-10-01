package com.squad.devsquad.controller;

import com.squad.devsquad.ProductService;
import com.squad.devsquad.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product")
public class Controller {
    @Autowired
    private ProductService productService;
    @GetMapping("/list")
    public String getProducts(){
        return "products";
    } // 1
    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id){
        return "product id :"+id;
    }
    @GetMapping
    public List<Product> searchProduct(@RequestParam("query") String name){
        return productService.search(name);
    }
}
