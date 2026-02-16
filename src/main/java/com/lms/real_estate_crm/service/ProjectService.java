package com.lms.real_estate_crm.service;



import org.springframework.data.domain.Pageable;

import com.lms.real_estate_crm.entity.ProjectEntity;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    ProjectEntity createProject(ProjectEntity project);

    Optional<ProjectEntity> getProjectById(String id);

    List<ProjectEntity> getProjects(String developerId, String locationId, String microMarket,
                                    String projectType, Pageable pageable);

    ProjectEntity updateProject(String id, ProjectEntity project);

    void deleteProject(String id);

    void projectComplianceReport(String developerId, String projectOwnerId);
}
