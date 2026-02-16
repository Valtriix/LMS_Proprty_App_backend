package com.lms.real_estate_crm.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.lms.real_estate_crm.entity.LeadEntity;

public interface LeadsRepository
        extends JpaRepository<LeadEntity, String>,
                JpaSpecificationExecutor<LeadEntity> {
}
