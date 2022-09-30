package com.cham.ssldemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/api/hello")
    @ResponseStatus(HttpStatus.OK)
    public String getHelloString() {
        log.info("Inside TestController.getHelloString()");
        return "Hello from HTTPS !";
    }
}
