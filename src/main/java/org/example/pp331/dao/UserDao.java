package org.example.pp331.dao;



import org.example.pp331.models.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getByIdUser(Long id);

    void save(User user);

    void update(Long id, User updateUser);

    void delete(Long id);
}
