package com.eugenesSoft.dao;

import com.eugenesSoft.model.User;

import java.util.List;

/**
 * Created by Eugene on 20.11.2016.
 */
public interface UserDao {
    User findById(int id);

    void saveUser(User user);
    void deleteUserById(Integer id);
    List<User> findAllUsers();
    List<User> finaAllUsersByName(String name);
    List<User> finaAllUsersByAge(Integer age);
}
