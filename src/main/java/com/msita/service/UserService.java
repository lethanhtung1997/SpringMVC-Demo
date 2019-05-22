package com.msita.service;

import com.msita.entity.User;

import java.util.List;

public interface UserService {

    void addUser(final User user);

    void deleteUser(String userId);

    User getUserById(final String userId);

    List<User> getAllUsers();

}
