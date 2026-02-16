package com.lms.real_estate_crm.controller;

import com.lms.crm.api.leads.LeadsApi;
import com.lms.crm.model.leads.Lead;
import com.lms.real_estate_crm.service.LeadsService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LeadsController implements LeadsApi {

    private final LeadsService leadService;

    public LeadsController(LeadsService leadService) {
        this.leadService = leadService;
    }

    @Override
    public ResponseEntity<Lead> createLead(Lead lead) {
        return ResponseEntity.status(201).body(leadService.createLead(lead));
    }

    @Override
    public ResponseEntity<Void> deleteLead(String id) {
        leadService.deleteLead(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Lead> getLeadById(String id) {
        return ResponseEntity.ok(leadService.getLeadById(id));
    }

    @Override
    public ResponseEntity<List<Lead>> getLeads(
            String projectId,
            String leadQuality,
            String status,
            LocalDate fromDate,
            LocalDate toDate,
            Integer page,
            Integer size
    ) {
        return ResponseEntity.ok(
                leadService.getLeads(
                        projectId,
                        leadQuality,
                        status,
                        fromDate,
                        toDate,
                        page,
                        size
                )
        );
    }

    @Override
    public ResponseEntity<Void> leadComplianceReport(String projectId, String salesUserId) {
        // placeholder – API contract satisfied
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Lead> updateLead(String id, Lead lead) {
        return ResponseEntity.ok(leadService.updateLead(id, lead));
    }
}

