package com.victorlobatomicrosservico.departamento.controller;

import com.victorlobatomicrosservico.departamento.model.Department;
import com.victorlobatomicrosservico.departamento.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    private Department saveDepartment(@RequestBody Department department){
        log.info("Dentro de saveDepartment em DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    private Department findDeparmentById(@PathVariable Long id){
        log.info("Dentro de findDeparmentById em DepartmentController");
        return departmentService.findDeparmentById(id);
    }
}
