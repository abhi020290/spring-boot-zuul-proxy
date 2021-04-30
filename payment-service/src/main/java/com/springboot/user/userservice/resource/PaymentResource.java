package com.springboot.user.userservice.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentResource {

    @GetMapping("/fetch")
    ResponseEntity<String> fetchPaymentDetails(){
        return ResponseEntity.ok("Payment Api is invoked");
    }
}
