package io.gihub.xsmair.springbootshowcase.services;

import io.gihub.xsmair.springbootshowcase.data.Department;
import io.gihub.xsmair.springbootshowcase.dtos.DepartmentDto;
import io.gihub.xsmair.springbootshowcase.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentService {

    final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(DepartmentDto departmentDto) {
        return departmentRepository.save(new Department(departmentDto));
    }
}
