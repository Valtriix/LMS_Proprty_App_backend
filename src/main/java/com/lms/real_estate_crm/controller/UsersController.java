package com.lms.real_estate_crm.controller;

import com.lms.crm.api.users.UsersApi;
import com.lms.crm.model.users.User;
import com.lms.real_estate_crm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController implements UsersApi {
    
	@Autowired
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<User> createUser(User user) {
        return ResponseEntity.status(201).body(userService.createUser(user));
    }

    @Override
    public ResponseEntity<Void> deactivateUser(String id) {
        userService.deactivateUser(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<User> getUserById(String id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @Override
    public ResponseEntity<List<User>> getUsers(String department, String status, Integer page, Integer size) {
        return ResponseEntity.ok(
                userService.getUsers(department, status, page, size)
        );
    }

    @Override
    public ResponseEntity<User> updateUser(String id, User user) {
        return ResponseEntity.ok(userService.updateUser(id, user));
    }
}
