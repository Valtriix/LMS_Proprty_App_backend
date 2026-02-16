package com.lms.real_estate_crm.specification;

import org.springframework.data.jpa.domain.Specification;

import com.lms.real_estate_crm.entity.UserEntity;

public class UserSpecification {

    private UserSpecification() {}

    public static Specification<UserEntity> hasDepartment(String department) {
        return (root, query, cb) ->
                department == null ? null : cb.equal(root.get("department"), department);
    }

    public static Specification<UserEntity> hasStatus(String status) {
        return (root, query, cb) ->
                status == null ? null : cb.equal(root.get("userStatus"), status);
    }
}
