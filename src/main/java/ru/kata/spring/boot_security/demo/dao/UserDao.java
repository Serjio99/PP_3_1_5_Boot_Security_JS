package ru.kata.spring.boot_security.demo.dao;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Set;

public interface UserDao {

    User findByUserEmail(String email);
    Set<User> getUsers();
    User getUser(Long id);
    void removeUser(Long id);
    void addUser(User user);
    void updateUser(User user);
}
