package com.JPAMapping.OneToOne.dao;

import com.JPAMapping.OneToOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StrudentRepo extends JpaRepository<Student,Long> {
}
