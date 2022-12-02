package io.gihub.xsmair.springbootshowcase.repositories;

import io.gihub.xsmair.springbootshowcase.data.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
