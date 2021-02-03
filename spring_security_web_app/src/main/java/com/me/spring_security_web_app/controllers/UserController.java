package com.me.spring_security_web_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping({ "/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/wellcome")
    public String wellcome() {
        return "wellcome";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
    
    @GetMapping("/login")
    public String login() {
    	return "login";
    }

    @GetMapping("/403")
    public String accessDenied() {
        return "403";
    }

}
