package com.squad.devsquad.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.*;
@Data
@RestController
@RequestMapping("/product")
public class Controller {
    @GetMapping("/list")
    public String getProducts(){
        return "products";
    } // 1
    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id){
        return "product id :"+id;
    }
//    @PostMapping("/")
//    public void createProduct(@RequestBody String productName){
//        System.out.println("create product "+ productName);
//    } 
    @GetMapping
    public String searchProduct(@RequestParam String name){
        return "search product "+name;
    }
}
