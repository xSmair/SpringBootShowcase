package io.gihub.xsmair.springbootshowcase.controllers;

import io.gihub.xsmair.springbootshowcase.data.Department;
import io.gihub.xsmair.springbootshowcase.dtos.DepartmentDto;
import io.gihub.xsmair.springbootshowcase.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/department")
    public DepartmentDto addDepartment(@RequestBody DepartmentDto departmentDto) {
        Department department = departmentService.saveDepartment(departmentDto);
        return new DepartmentDto(department);
    }
}
