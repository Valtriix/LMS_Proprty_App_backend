package com.lms.real_estate_crm.mapper;
 
 
import com.lms.crm.model.leads.Lead;
import com.lms.real_estate_crm.entity.LeadEntity;

 
public class LeadMapper {
 
    public static LeadEntity toEntity(Lead api) {

        LeadEntity e = new LeadEntity();
 
        e.setLeadId(api.getLeadId());

        e.setSource(api.getSource());

        e.setLeadName(api.getLeadName());

        e.setEmail(api.getEmail());

        e.setContactNo(api.getContactNo());

        e.setWhatsappNo(api.getWhatsappNo());

        e.setConfiguration(api.getConfiguration());

        e.setLeadQuality(api.getLeadQuality());

        e.setStatus(api.getStatus());

        e.setProjectId(api.getProjectId());

        e.setProjectOwnerId(api.getProjectOwnerId());

        e.setLastContactDate(api.getLastContactDate());

        e.setNextContactDate(api.getNextContactDate());

        e.setComments(api.getComments());

        e.setCrossPitchProjects(api.getCrossPitchProjects());

        e.setCampaignName(api.getCampaignName());

        e.setLandingPageUrl(api.getLandingPageUrl());
 
        return e;

    }
 
    public static Lead toApi(LeadEntity e) {

        Lead api = new Lead();
 
        api.setId(String.valueOf(e.getId()));

        api.setLeadId(e.getLeadId());

        api.setSource(e.getSource());

        api.setLeadName(e.getLeadName());

        api.setEmail(e.getEmail());

        api.setContactNo(e.getContactNo());

        api.setWhatsappNo(e.getWhatsappNo());

        api.setConfiguration(e.getConfiguration());

        api.setLeadQuality(e.getLeadQuality());

        api.setStatus(e.getStatus());

        api.setProjectId(e.getProjectId());

        api.setProjectOwnerId(e.getProjectOwnerId());

        api.setLastContactDate(e.getLastContactDate());

        api.setNextContactDate(e.getNextContactDate());

        api.setComments(e.getComments());

        api.setCrossPitchProjects(e.getCrossPitchProjects());

        api.setCampaignName(e.getCampaignName());

        api.setLandingPageUrl(e.getLandingPageUrl());
 
        return api;

    }

}
 
 