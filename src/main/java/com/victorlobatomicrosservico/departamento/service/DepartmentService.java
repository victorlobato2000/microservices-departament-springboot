package com.victorlobatomicrosservico.departamento.service;

import com.victorlobatomicrosservico.departamento.model.Department;
import com.victorlobatomicrosservico.departamento.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Dentro de saveDepartment em DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDeparmentById(Long id) {
        log.info("Dentro de findDeparmentById em DepartmentService");
        return departmentRepository.findDepartmentById(id);
    }
}
