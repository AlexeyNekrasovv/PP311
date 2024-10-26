package org.example.pp331.service;

import org.example.pp331.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getByIdUser(Long id);

    void save(User user);

    void update(Long id, User updateUser);

    void delete(Long id);
}