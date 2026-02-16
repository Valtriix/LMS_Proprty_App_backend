package com.lms.real_estate_crm.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;

@Entity
@Table(name = "projects")
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String projectName;

    @Column(nullable = false)
    private String developerId;

    @Column(nullable = false)
    private String locationId;

    private String microMarket;
    private String projectType;
    private String sourcingManagerId;
    private String closingManagerId;
    private Integer tagPeriodDays;

    @ElementCollection
    private List<String> projectOwnerIds = new ArrayList<>();

    public ProjectEntity() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getMicroMarket() {
		return microMarket;
	}

	public void setMicroMarket(String microMarket) {
		this.microMarket = microMarket;
	}

	public String getProjectType() {
		return projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getSourcingManagerId() {
		return sourcingManagerId;
	}

	public void setSourcingManagerId(String sourcingManagerId) {
		this.sourcingManagerId = sourcingManagerId;
	}

	public String getClosingManagerId() {
		return closingManagerId;
	}

	public void setClosingManagerId(String closingManagerId) {
		this.closingManagerId = closingManagerId;
	}

	public Integer getTagPeriodDays() {
		return tagPeriodDays;
	}

	public void setTagPeriodDays(Integer tagPeriodDays) {
		this.tagPeriodDays = tagPeriodDays;
	}

	public List<String> getProjectOwnerIds() {
		return projectOwnerIds;
	}

	public void setProjectOwnerIds(List<String> projectOwnerIds) {
		this.projectOwnerIds = projectOwnerIds;
	}
    
    

   
}
