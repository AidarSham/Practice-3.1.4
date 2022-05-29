package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> listAll();
    void save(User user);
    User get(Long id);
    void delete(Long id);
    User getUserByUsername(String username);
}
