package com.sagar.spring_boot_blog_application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public static String getLoginPage(){
        return "login";
    }
}
