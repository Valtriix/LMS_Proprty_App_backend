package com.lms.real_estate_crm.specification;

import org.springframework.data.jpa.domain.Specification;

import com.lms.real_estate_crm.entity.LeadEntity;

import java.time.LocalDate;

public class LeadSpecifications {

    public static Specification<LeadEntity> hasProjectId(String projectId) {
        return (root, query, cb) ->
                projectId == null ? null : cb.equal(root.get("projectId"), projectId);
    }

    public static Specification<LeadEntity> hasLeadQuality(String leadQuality) {
        return (root, query, cb) ->
                leadQuality == null ? null : cb.equal(root.get("leadQuality"), leadQuality);
    }

    public static Specification<LeadEntity> hasStatus(String status) {
        return (root, query, cb) ->
                status == null ? null : cb.equal(root.get("status"), status);
    }

    public static Specification<LeadEntity> fromDate(LocalDate fromDate) {
        return (root, query, cb) ->
                fromDate == null ? null : cb.greaterThanOrEqualTo(
                        root.get("lastContactDate"), fromDate);
    }

    public static Specification<LeadEntity> toDate(LocalDate toDate) {
        return (root, query, cb) ->
                toDate == null ? null : cb.lessThanOrEqualTo(
                        root.get("lastContactDate"), toDate);
    }
}
