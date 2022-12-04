package io.gihub.xsmair.springbootshowcase.data;

import io.gihub.xsmair.springbootshowcase.dtos.DepartmentDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Department() {

    }

    public Department(String name){
        this.name = name;
    }

    public Department(DepartmentDto departmentDto) {
        this.name = departmentDto.getName();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
