package com.lms.real_estate_crm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.lms.crm.model.users.User;
import com.lms.real_estate_crm.entity.UserEntity;
import com.lms.real_estate_crm.mapper.UserMapper;
import com.lms.real_estate_crm.repository.UserRepository;
import com.lms.real_estate_crm.specification.UserSpecification;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User createUser(User user) {
        UserEntity entity = userMapper.toEntity(user);
        entity.setUserStatus("Active");
        return userMapper.toModel(userRepository.save(entity));
    }

    @Override
    public User getUserById(String id) {
        UserEntity entity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return userMapper.toModel(entity);
    }

    @Override
    public List<User> getUsers(String department, String status, int page, int size) {

        Specification<UserEntity> spec = Specification
                .where(UserSpecification.hasDepartment(department))
                .and(UserSpecification.hasStatus(status));

        return userRepository.findAll(spec, PageRequest.of(page, size))
                .stream()
                .map(userMapper::toModel)
                .toList();
    }

    @Override
    public User updateUser(String id, User user) {
        UserEntity entity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        entity.setUserName(user.getUserName());
        entity.setEmail(user.getEmail());
        entity.setContact(user.getContact());
        entity.setDepartment(user.getDepartment());
        entity.setPosition(user.getPosition());
        entity.setProjectAssigned(user.getProjectAssigned());
        entity.setTelecallerAssigned(user.getTelecallerAssigned());
        entity.setPermissions(user.getPermissions());

        return userMapper.toModel(userRepository.save(entity));
    }

    @Override
    public void deactivateUser(String id) {
        UserEntity entity = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        entity.setUserStatus("Inactive");
        userRepository.save(entity);
    }
}
