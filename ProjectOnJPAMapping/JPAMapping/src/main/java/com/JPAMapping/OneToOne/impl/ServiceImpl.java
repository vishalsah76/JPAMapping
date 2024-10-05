package com.JPAMapping.OneToOne.impl;

import com.JPAMapping.JpaMappingApplication;
import com.JPAMapping.OneToOne.dao.StrudentRepo;
import com.JPAMapping.OneToOne.entity.Student;
import com.JPAMapping.OneToOne.service.JPAService;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements JPAService {
    private StrudentRepo strudentRepo;

    public ServiceImpl(StrudentRepo strudentRepo) {
        this.strudentRepo = strudentRepo;
    }

    @Override
    public Student saveStudent(Student student) {
        return strudentRepo.save(student);
    }
}
