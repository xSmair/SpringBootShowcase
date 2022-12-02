package io.gihub.xsmair.springbootshowcase.controllers;

import io.gihub.xsmair.springbootshowcase.data.Employee;
import io.gihub.xsmair.springbootshowcase.dtos.EmployeeDto;
import io.gihub.xsmair.springbootshowcase.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<EmployeeDto> getEmployee() {
        List<EmployeeDto> mappedEmployees = new ArrayList<>();
        List<Employee> e = employeeService.getEmployees();
        for (Employee employee : e) {
            EmployeeDto employeeDto = new EmployeeDto(employee.getFirstName(), employee.getLastName(), employee.getCreated());
            mappedEmployees.add(employeeDto);
        }
        return mappedEmployees;
    }

    @PostMapping("/employee")
    public @ResponseBody EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        Employee savedEntity = employeeService.saveEmployee(employee);
        return new EmployeeDto(savedEntity.getFirstName(), savedEntity.getLastName(), savedEntity.getCreated());
    }
}
