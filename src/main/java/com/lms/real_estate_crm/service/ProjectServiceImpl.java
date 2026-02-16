package com.lms.real_estate_crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.lms.real_estate_crm.entity.ProjectEntity;
import com.lms.real_estate_crm.repository.ProjectRepository;
import com.lms.real_estate_crm.specification.ProjectSpecification;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public ProjectEntity createProject(ProjectEntity project) {
        return projectRepository.save(project);
    }

    @Override
    public Optional<ProjectEntity> getProjectById(String id) {
        return projectRepository.findById(id);
    }

    @Override
    public List<ProjectEntity> getProjects(String developerId, String locationId, String microMarket,
                                           String projectType, Pageable pageable) {
        return projectRepository.findAll(ProjectSpecification.filterBy(developerId, locationId, microMarket, projectType), pageable).getContent();
    }

    @Override
    public ProjectEntity updateProject(String id, ProjectEntity project) {
        project.setId(id);
        return projectRepository.save(project);
    }

    @Override
    public void deleteProject(String id) {
        projectRepository.deleteById(id);
    }

    @Override
    public void projectComplianceReport(String developerId, String projectOwnerId) {
        // You can implement your compliance report logic here
    }
}
