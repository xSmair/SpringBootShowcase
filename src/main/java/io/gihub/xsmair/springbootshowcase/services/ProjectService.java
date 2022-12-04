package io.gihub.xsmair.springbootshowcase.services;

import io.gihub.xsmair.springbootshowcase.data.Project;
import io.gihub.xsmair.springbootshowcase.dtos.ProjectDto;
import io.gihub.xsmair.springbootshowcase.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectService {

    final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    public Project AddEmployeeToProject(Long projectId, Long employeeId) {
        if(projectRepository.findById(projectId).isPresent()) {
            projectRepository.AddEmployeeToProject(projectId, employeeId);
            Project project = projectRepository.findById(projectId).get();
            return project;
        }
        throw new RuntimeException("Project not found");
    }
}
