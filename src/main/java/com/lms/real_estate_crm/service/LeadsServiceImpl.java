package com.lms.real_estate_crm.service;

import com.lms.crm.model.leads.Lead;
import com.lms.real_estate_crm.entity.LeadEntity;
import com.lms.real_estate_crm.mapper.LeadMapper;
import com.lms.real_estate_crm.repository.LeadsRepository;
import com.lms.real_estate_crm.specification.LeadSpecifications;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LeadsServiceImpl implements LeadsService {

    private final LeadsRepository leadRepository;

    public LeadsServiceImpl(LeadsRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    @Override
    public Lead createLead(Lead lead) {
        LeadEntity entity = LeadMapper.toEntity(lead);
        LeadEntity saved = leadRepository.save(entity);
        return LeadMapper.toApi(saved);
    }

    @Override
    public Lead getLeadById(String id) {
        LeadEntity entity = leadRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lead not found with id: " + id));
        return LeadMapper.toApi(entity);
    }

    @Override
    public List<Lead> getLeads(
            String projectId,
            String leadQuality,
            String status,
            LocalDate fromDate,
            LocalDate toDate,
            int page,
            int size
    ) {

        Specification<LeadEntity> spec = Specification
                .where(LeadSpecifications.hasProjectId(projectId))
                .and(LeadSpecifications.hasLeadQuality(leadQuality))
                .and(LeadSpecifications.hasStatus(status))
                .and(LeadSpecifications.fromDate(fromDate))
                .and(LeadSpecifications.toDate(toDate));

        return leadRepository
                .findAll(spec, PageRequest.of(page, size))
                .map(LeadMapper::toApi)
                .toList();
    }

    @Override
    public Lead updateLead(String id, Lead lead) {
        LeadEntity existing = leadRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lead not found with id: " + id));

        LeadEntity updated = LeadMapper.toEntity(lead);
        updated.setId(existing.getId());

        return LeadMapper.toApi(leadRepository.save(updated));
    }

    @Override
    public void deleteLead(String id) {
        if (!leadRepository.existsById(id)) {
            throw new RuntimeException("Lead not found with id: " + id);
        }
        leadRepository.deleteById(id);
    }
}
