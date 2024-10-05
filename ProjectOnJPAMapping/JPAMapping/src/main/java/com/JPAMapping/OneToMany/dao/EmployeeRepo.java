package com.JPAMapping.OneToMany.dao;

import com.JPAMapping.OneToMany.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
