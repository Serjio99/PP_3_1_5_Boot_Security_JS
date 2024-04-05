package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {   // отображаем логинтраницу при обращении по корневому URL
    @GetMapping("/")
    public String loginPage() {
        return "/login";
    }
}
