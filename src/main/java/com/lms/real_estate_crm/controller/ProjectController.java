package com.lms.real_estate_crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.lms.crm.api.projects.ProjectsApi;
import com.lms.crm.model.projects.Project;
import com.lms.real_estate_crm.entity.ProjectEntity;
import com.lms.real_estate_crm.mapper.ProjectMapper;
import com.lms.real_estate_crm.service.ProjectService;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000/leads/new")
@RestController
public class ProjectController implements ProjectsApi {

    @Autowired
    private ProjectService projectService;

    @Override
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        ProjectEntity entity = ProjectMapper.toEntity(project);
        ProjectEntity saved = projectService.createProject(entity);
        return ResponseEntity.status(201).body(ProjectMapper.toModel(saved));
    }

    @Override
    public ResponseEntity<Void> deleteProject(String id) {
        projectService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Project> getProjectById(String id) {
        Optional<ProjectEntity> entity = projectService.getProjectById(id);
        return entity.map(e -> ResponseEntity.ok(ProjectMapper.toModel(e)))
                     .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<List<Project>> getProjects(String developerId, String locationId, String microMarket,
                                                     String projectType, Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page != null ? page : 0, size != null ? size : 20);
        List<ProjectEntity> entities = projectService.getProjects(developerId, locationId, microMarket, projectType, pageable);
        return ResponseEntity.ok(ProjectMapper.toModelList(entities));
    }

    @Override
    public ResponseEntity<Void> projectComplianceReport(String developerId, String projectOwnerId) {
        projectService.projectComplianceReport(developerId, projectOwnerId);
        return ResponseEntity.ok().build(); // Stub, implement logic if needed
    }

    @Override
    public ResponseEntity<Project> updateProject(String id, Project project) {
        ProjectEntity entity = ProjectMapper.toEntity(project);
        ProjectEntity updated = projectService.updateProject(id, entity);
        return ResponseEntity.ok(ProjectMapper.toModel(updated));
    }
}
