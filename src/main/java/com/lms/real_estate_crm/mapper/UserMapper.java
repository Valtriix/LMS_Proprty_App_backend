package com.lms.real_estate_crm.mapper;

import com.lms.crm.model.users.User;
import com.lms.real_estate_crm.entity.UserEntity;

import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        entity.setId(user.getId());
        entity.setUserStatus(user.getUserStatus());
        entity.setUserName(user.getUserName());
        entity.setEmail(user.getEmail());
        entity.setContact(user.getContact());
        entity.setDepartment(user.getDepartment());
        entity.setPosition(user.getPosition());
        entity.setProjectAssigned(user.getProjectAssigned());
        entity.setTelecallerAssigned(user.getTelecallerAssigned());
        entity.setPermissions(user.getPermissions());
        return entity;
    }

    public User toModel(UserEntity entity) {
        User user = new User();
        user.setId(entity.getId());
        user.setUserStatus(entity.getUserStatus());
        user.setUserName(entity.getUserName());
        user.setEmail(entity.getEmail());
        user.setContact(entity.getContact());
        user.setDepartment(entity.getDepartment());
        user.setPosition(entity.getPosition());
        user.setProjectAssigned(entity.getProjectAssigned());
        user.setTelecallerAssigned(entity.getTelecallerAssigned());
        user.setPermissions(entity.getPermissions());
        return user;
    }
}
