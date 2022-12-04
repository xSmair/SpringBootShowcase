package io.gihub.xsmair.springbootshowcase.dtos;

import io.gihub.xsmair.springbootshowcase.data.Employee;

import java.time.LocalDateTime;

public class EmployeeDto {

    public String firstName;

    public String lastName;

    public LocalDateTime created;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public EmployeeDto(Employee employee) {
        this.firstName = employee.getFirstName();
        this.lastName = employee.getLastName();
        this.created = employee.getCreated();
    }

    public EmployeeDto() {
    }

    public EmployeeDto(String firstName, String lastName, LocalDateTime created) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.created = created;
    }
}
