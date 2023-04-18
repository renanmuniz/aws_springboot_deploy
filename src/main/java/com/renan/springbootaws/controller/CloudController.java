package com.renan.springbootaws.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@Slf4j
public class CloudController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello () {
        log.info("Hello Cloud! - " + LocalDateTime.now());
        return ResponseEntity.ok("Hello Cloud! - " + LocalDateTime.now());
    }

}
