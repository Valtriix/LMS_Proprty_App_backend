package com.lms.real_estate_crm.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.lms.real_estate_crm.entity.UserEntity;

public interface UserRepository
        extends JpaRepository<UserEntity, String>,
                JpaSpecificationExecutor<UserEntity> {
}
