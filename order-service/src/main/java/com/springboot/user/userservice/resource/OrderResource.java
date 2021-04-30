package com.springboot.user.userservice.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderResource {

    @GetMapping("/fetch")
    ResponseEntity<String> fetchOrderDetails(){
        return ResponseEntity.ok("Order Api is invoked");
    }
}
