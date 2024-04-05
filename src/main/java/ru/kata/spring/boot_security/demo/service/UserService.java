package ru.kata.spring.boot_security.demo.service;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.Set;

public interface UserService {
    Set<User> getUsers();
    User getUser(Long id);
    void addUser(User user);
    void updateUser(User user);
    void removeUser(Long id);
    User findByUserEmail(String email);
}
