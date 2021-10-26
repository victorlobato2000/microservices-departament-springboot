package com.victorlobatomicrosservico.departamento.repository;

import com.victorlobatomicrosservico.departamento.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findDepartmentById(Long id);
}
