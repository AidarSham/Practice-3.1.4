package ru.kata.spring.boot_security.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.boot_security.demo.dao.RoleRepository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(long id){
        return roleRepository.findById(id).get();
    }

    public void deleteRole(long id) {
        roleRepository.deleteById(id);
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    public Role updateRole(long id) {
        return roleRepository.save(roleRepository.getOne(id));
    }
}
