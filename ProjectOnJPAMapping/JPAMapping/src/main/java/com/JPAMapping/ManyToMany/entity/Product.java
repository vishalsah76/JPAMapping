package com.JPAMapping.ManyToMany.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "jpa_product")
public class Product {

    @Id
    private String pID;
    private String pName;

    @ManyToMany(mappedBy = "products")
    private List<Category> category=new ArrayList<>();
}
