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

@Table(name ="jpa_category")
public class Category {

    @Id
    private String cID;
    private String cName;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products=new ArrayList<>();

    @Override
    public String toString() {
        return "Category{" +
                "cID='" + cID + '\'' +
                ", cName='" + cName + '\'' +
                '}';
    }
}
