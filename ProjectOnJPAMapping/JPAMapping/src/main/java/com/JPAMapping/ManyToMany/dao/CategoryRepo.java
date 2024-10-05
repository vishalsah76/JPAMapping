package com.JPAMapping.ManyToMany.dao;

import com.JPAMapping.ManyToMany.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category,String> {

    @Query(value = "select * from jpa_category", nativeQuery = true)
    public List<Category> getAllCategory();
}
