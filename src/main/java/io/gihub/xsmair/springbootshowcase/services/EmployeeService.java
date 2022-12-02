package io.gihub.xsmair.springbootshowcase.services;

import io.gihub.xsmair.springbootshowcase.data.Employee;
import io.gihub.xsmair.springbootshowcase.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees(){
        Iterable<Employee> iterable = employeeRepository.findAll();
        return (List<Employee>) iterable;
    }

    public Employee saveEmployee(Employee employee) {
        employee.setCreated(LocalDateTime.now());
        return employeeRepository.save(employee);
    }
}
