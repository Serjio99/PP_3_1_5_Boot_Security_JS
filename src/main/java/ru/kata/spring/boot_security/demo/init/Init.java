package ru.kata.spring.boot_security.demo.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleServiceImp;
import ru.kata.spring.boot_security.demo.service.UserService;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class Init {

    private final RoleServiceImp roleService;
    private final UserService userService;

    @Autowired
    public Init(RoleServiceImp roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void run() {
        Role adminRole = new Role("ROLE_ADMIN");
        Role userRole = new Role("ROLE_USER");

        roleService.addRole(adminRole);
        roleService.addRole(userRole);

        userService.addUser(new User("admin", "Ivan", "1@mail.ru", "111", Set.of(adminRole)));
        userService.addUser(new User("user", "Serge", "2@mail.ru", "222",Set.of(userRole)));
    }
}