package com.example.servicio.repository;

import com.example.servicio.entity.Category;
import com.example.servicio.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product> findbyCategory(Category category);
}
