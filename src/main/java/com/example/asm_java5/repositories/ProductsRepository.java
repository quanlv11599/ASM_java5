package com.example.asm_java5.repositories;

import com.example.asm_java5.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {
    Products findAllById(Integer Id);
}
