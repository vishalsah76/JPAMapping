package com.JPAMapping.OneToOne.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="jpa_Laptop")
public class Laptop {

    @Id
    private Long laptopID;
    private String brand;
    private String modelNumber;

    @OneToOne
    @JoinColumn(name= "student_id")
    private Student student;

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopID=" + laptopID +
                ", brand='" + brand + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", student=" + student +
                '}';
    }
}
