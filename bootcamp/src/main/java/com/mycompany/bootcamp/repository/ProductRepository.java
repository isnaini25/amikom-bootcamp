/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bootcamp.repository;


import com.mycompany.bootcamp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author leeseona25
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
