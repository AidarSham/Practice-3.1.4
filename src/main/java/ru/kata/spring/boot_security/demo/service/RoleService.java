package ru.kata.spring.boot_security.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Service
@Transactional
public interface RoleService {

    List<Role> getAllRoles();
    Role getRoleById(long id);
    void deleteRole(long id);
    Role saveRole(Role role);
    Role updateRole(long id);
}
