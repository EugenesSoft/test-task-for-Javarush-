package com.eugenesSoft.service;

import com.eugenesSoft.model.User;

import java.util.List;

/**
 * Created by Eugene on 20.11.2016.
 */
public interface UserService {
    User findById(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteById(Integer id);
    List<User> getAllUsers();
    List<User> getAllUsersByName(String name);
    List<User> getAllUsersByAge(Integer age);
    boolean isIdUnique(Integer id, User user);
    boolean isIdUniqueForRegistration(Integer id);
}
