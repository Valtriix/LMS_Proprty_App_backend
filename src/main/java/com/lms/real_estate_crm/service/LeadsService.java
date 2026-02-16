package com.lms.real_estate_crm.service;

import com.lms.crm.model.leads.Lead;

import java.time.LocalDate;
import java.util.List;

public interface LeadsService {

    Lead createLead(Lead lead);

    Lead getLeadById(String id);

    List<Lead> getLeads(
            String projectId,
            String leadQuality,
            String status,
            LocalDate fromDate,
            LocalDate toDate,
            int page,
            int size
    );

    Lead updateLead(String id, Lead lead);

    void deleteLead(String id);
}
