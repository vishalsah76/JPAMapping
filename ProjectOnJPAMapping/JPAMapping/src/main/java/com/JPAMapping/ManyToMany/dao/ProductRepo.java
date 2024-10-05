package com.JPAMapping.ManyToMany.dao;

import com.JPAMapping.ManyToMany.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}
