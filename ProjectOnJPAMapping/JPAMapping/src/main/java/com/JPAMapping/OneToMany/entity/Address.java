package com.JPAMapping.OneToMany.entity;

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
@Table(name="jpa-address")
public class Address {
    @Id
    private Long addressID;
    private String city;
    private String state;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
