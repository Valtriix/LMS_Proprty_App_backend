package com.lms.real_estate_crm.specification;


import org.springframework.data.jpa.domain.Specification;

import com.lms.real_estate_crm.entity.ProjectEntity;

public class ProjectSpecification {

    public static Specification<ProjectEntity> filterBy(String developerId, String locationId, String microMarket, String projectType) {
        return (root, query, cb) -> {
            var predicates = cb.conjunction();
            if (developerId != null) predicates.getExpressions().add(cb.equal(root.get("developerId"), developerId));
            if (locationId != null) predicates.getExpressions().add(cb.equal(root.get("locationId"), locationId));
            if (microMarket != null) predicates.getExpressions().add(cb.equal(root.get("microMarket"), microMarket));
            if (projectType != null) predicates.getExpressions().add(cb.equal(root.get("projectType"), projectType));
            return predicates;
        };
    }
}
