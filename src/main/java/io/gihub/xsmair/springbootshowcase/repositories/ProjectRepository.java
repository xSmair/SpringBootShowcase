package io.gihub.xsmair.springbootshowcase.repositories;

import io.gihub.xsmair.springbootshowcase.data.Project;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    @Modifying
    @Query(value = "INSERT INTO project_employees (project_id, employees_id) VALUES (:projectId, :employeeId)", nativeQuery = true)
    @Transactional
    void AddEmployeeToProject(@Param("projectId")Long projectId, @Param("employeeId")Long employeeId);
}

