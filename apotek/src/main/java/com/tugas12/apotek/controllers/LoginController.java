package com.tugas12.apotek.controllers;

import com.tugas12.apotek.models.Login;
import com.tugas12.apotek.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (loginService.authenticate(username, password) != null) {
            return "redirect:/home";
        }
        model.addAttribute("error", "Invalid username or password");
        return "login";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "registrasi";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Login login) {
        loginService.register(login);
        return "redirect:/login";
    }
}
