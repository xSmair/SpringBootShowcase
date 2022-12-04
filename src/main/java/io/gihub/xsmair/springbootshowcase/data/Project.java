package io.gihub.xsmair.springbootshowcase.data;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToMany
    private List<Employee> employees;

    public Long getId() {
        return id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Project(Long id, String name, String description, List<Employee> employees) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employees = employees;
    }

    public Project() {
    }
}
