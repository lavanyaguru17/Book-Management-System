package com.BookManagementSystem.BookManagementSystem.service;
import com.BookManagementSystem.BookManagementSystem.model.User;
import com.BookManagementSystem.BookManagementSystem.repository.RoleRepository;
import com.BookManagementSystem.BookManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.HashSet;
@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    private RoleRepository roleRepository;
    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    public void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}