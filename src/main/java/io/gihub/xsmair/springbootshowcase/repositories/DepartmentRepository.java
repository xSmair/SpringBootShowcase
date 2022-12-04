package io.gihub.xsmair.springbootshowcase.repositories;

import io.gihub.xsmair.springbootshowcase.data.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}

