package com.wenhao.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    /*@Value("${server.port}")
    private String port;*/

    @GetMapping(value = "hi")
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi，your message is : %s", message);
    }
}