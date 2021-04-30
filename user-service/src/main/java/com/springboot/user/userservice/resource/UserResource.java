package com.springboot.user.userservice.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource {

    @GetMapping("/fetch")
    ResponseEntity<String> fetchUserDetails(){
        return ResponseEntity.ok("User Api is invoked");
    }
}
