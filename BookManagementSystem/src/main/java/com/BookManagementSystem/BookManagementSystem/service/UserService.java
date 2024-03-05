package com.BookManagementSystem.BookManagementSystem.service;
import com.BookManagementSystem.BookManagementSystem.model.User;
public interface UserService {
    void save(User user);
    User findByUsername(String username);
}