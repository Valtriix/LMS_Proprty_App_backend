package com.lms.real_estate_crm.service;


import com.lms.crm.model.users.User;
import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(String id);

    List<User> getUsers(String department, String status, int page, int size);

    User updateUser(String id, User user);

    void deactivateUser(String id);
}
