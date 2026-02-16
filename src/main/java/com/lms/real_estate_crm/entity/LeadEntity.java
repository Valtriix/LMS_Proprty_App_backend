package com.lms.real_estate_crm.entity;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "leads")
public class LeadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String leadId;
    private String source;
    private String leadName;
    private String email;
    private String contactNo;
    private String whatsappNo;
    private String configuration;
    private String leadQuality;
    private String status;
    private String projectId;
    private String projectOwnerId;
    private LocalDate lastContactDate;
    private LocalDate nextContactDate;
    private String comments;

    @ElementCollection
    private List<String> crossPitchProjects;

    private String campaignName;
    private String landingPageUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLeadId() {
		return leadId;
	}
	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getWhatsappNo() {
		return whatsappNo;
	}
	public void setWhatsappNo(String whatsappNo) {
		this.whatsappNo = whatsappNo;
	}
	public String getConfiguration() {
		return configuration;
	}
	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	public String getLeadQuality() {
		return leadQuality;
	}
	public void setLeadQuality(String leadQuality) {
		this.leadQuality = leadQuality;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectOwnerId() {
		return projectOwnerId;
	}
	public void setProjectOwnerId(String projectOwnerId) {
		this.projectOwnerId = projectOwnerId;
	}
	public LocalDate getLastContactDate() {
		return lastContactDate;
	}
	public void setLastContactDate(LocalDate lastContactDate) {
		this.lastContactDate = lastContactDate;
	}
	public LocalDate getNextContactDate() {
		return nextContactDate;
	}
	public void setNextContactDate(LocalDate nextContactDate) {
		this.nextContactDate = nextContactDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public List<String> getCrossPitchProjects() {
		return crossPitchProjects;
	}
	public void setCrossPitchProjects(List<String> crossPitchProjects) {
		this.crossPitchProjects = crossPitchProjects;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getLandingPageUrl() {
		return landingPageUrl;
	}
	public void setLandingPageUrl(String landingPageUrl) {
		this.landingPageUrl = landingPageUrl;
	}
    
    
}
