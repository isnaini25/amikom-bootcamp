/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bootcamp.service;

import com.mycompany.bootcamp.entity.Product;
import com.mycompany.bootcamp.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author leeseona25
 */
@Service
public class ProductImplement implements ProductInterface{

    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    
    @Override
    public void save(Product product){
        productRepository.save(product);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
