package com.squad.devsquad;

import com.squad.devsquad.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;//objet
    public List<Product> search(String name) {
        return productRepository.findByProductName(name);
    }
}
