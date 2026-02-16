package com.lms.real_estate_crm.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.lms.crm.model.projects.Project;
import com.lms.real_estate_crm.entity.ProjectEntity;

public class ProjectMapper {

    public static ProjectEntity toEntity(Project model) {
        if (model == null) return null;
        ProjectEntity entity = new ProjectEntity();
        entity.setId(model.getId());
        entity.setProjectName(model.getProjectName());
        entity.setDeveloperId(model.getDeveloperId());
        entity.setLocationId(model.getLocationId());
        entity.setMicroMarket(model.getMicroMarket());
        entity.setProjectType(model.getProjectType());
        entity.setSourcingManagerId(model.getSourcingManagerId());
        entity.setClosingManagerId(model.getClosingManagerId());
        entity.setTagPeriodDays(model.getTagPeriodDays());
        entity.setProjectOwnerIds(model.getProjectOwnerIds());
        return entity;
    }

    public static Project toModel(ProjectEntity entity) {
        if (entity == null) return null;
        Project model = new Project();
        model.setId(entity.getId());
        model.setProjectName(entity.getProjectName());
        model.setDeveloperId(entity.getDeveloperId());
        model.setLocationId(entity.getLocationId());
        model.setMicroMarket(entity.getMicroMarket());
        model.setProjectType(entity.getProjectType());
        model.setSourcingManagerId(entity.getSourcingManagerId());
        model.setClosingManagerId(entity.getClosingManagerId());
        model.setTagPeriodDays(entity.getTagPeriodDays());
        model.setProjectOwnerIds(entity.getProjectOwnerIds());
        return model;
    }

    public static List<Project> toModelList(List<ProjectEntity> entities) {
        return entities.stream().map(ProjectMapper::toModel).collect(Collectors.toList());
    }
}
