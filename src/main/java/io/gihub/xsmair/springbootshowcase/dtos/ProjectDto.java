package io.gihub.xsmair.springbootshowcase.dtos;

import io.gihub.xsmair.springbootshowcase.data.Project;

import java.util.List;

public class ProjectDto {

    private String name;

    private String description;

    private List<EmployeeDto> employees;

    public ProjectDto(Project project) {
        this.name = project.getName();
        this.description = project.getDescription();
        this.employees = project.getEmployees().stream().map(EmployeeDto::new).toList();
    }

    public Project mapToProject() {
        Project project = new Project();
        project.setName(name);
        project.setDescription(description);
        return project;
    }

    public ProjectDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ProjectDto() {
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
}
