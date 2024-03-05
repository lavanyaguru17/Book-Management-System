package com.BookManagementSystem.BookManagementSystem.service;
public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}