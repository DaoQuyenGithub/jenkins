package com.develop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class AppController {

    @GetMapping("/test")
    public String test(@RequestParam String test) {
        log.info("Receive msg: {}", test);
        return test;
    }

}
