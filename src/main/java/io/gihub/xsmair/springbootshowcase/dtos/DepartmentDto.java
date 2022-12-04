package io.gihub.xsmair.springbootshowcase.dtos;

import io.gihub.xsmair.springbootshowcase.data.Department;

public class DepartmentDto {

    public String name;

    public DepartmentDto() {
    }

    public DepartmentDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentDto(Department department) {
        this.name = department.getName();
    }
}
