package com.JPAMapping.OneToMany.entity;

import com.JPAMapping.OneToOne.entity.Laptop;
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

@Table(name="jpa_employee")
public class Employee {
    @Id
    private Long empID;
    private String empName;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List<Address> addresses=new ArrayList<>();


}
