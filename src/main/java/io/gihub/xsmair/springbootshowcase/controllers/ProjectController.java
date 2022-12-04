package io.gihub.xsmair.springbootshowcase.controllers;

import io.gihub.xsmair.springbootshowcase.data.Project;
import io.gihub.xsmair.springbootshowcase.dtos.ProjectDto;
import io.gihub.xsmair.springbootshowcase.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/project")
    public List<ProjectDto> getProjects() {
        List<Project> projects = projectService.getAllProjects();
        return projects.stream().map(ProjectDto::new).collect(Collectors.toList());
    }

    @PostMapping("/project")
    public ProjectDto addProject(@RequestBody ProjectDto projectDto) {
        Project project = projectDto.mapToProject();
        System.out.println(projectDto.getName());
        System.out.println(project.getName());
        Project savedEntity = projectService.saveProject(project);
        return new ProjectDto(savedEntity);
    }

    @PutMapping("/project/{projectId}/{employeeId}")
    public ProjectDto updateProject(@PathVariable Long projectId, @PathVariable Long employeeId) {
       Project project = projectService.AddEmployeeToProject(projectId, employeeId);
       return new ProjectDto(project);
    }

}
