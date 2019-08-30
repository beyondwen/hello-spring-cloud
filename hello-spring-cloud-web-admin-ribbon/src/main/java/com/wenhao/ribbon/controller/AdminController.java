package com.wenhao.ribbon.controller;

import com.wenhao.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam String message) {
        return adminService.sayHi(message);
    }
}