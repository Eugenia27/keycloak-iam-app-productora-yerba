package com.dh.productorayerba.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/anonymous")
    public ResponseEntity<String> getAnonymous() {

        return ResponseEntity.ok("Hello Anonymous");
    }

    @GetMapping("/admin")
    public ResponseEntity<String> getAdmin() {

        return ResponseEntity.ok("Hello Admin!");
    }

    @GetMapping("/manager")
    public ResponseEntity<String> getManager(Principal principal) {
        return ResponseEntity.ok("Hello Manager!");
    }

    @GetMapping("/employer")
    public ResponseEntity<String> getEmployer(Principal principal) {
        return ResponseEntity.ok("Hello Employer!");
    }
}