package com.sprinbootfeignclient.paymentfeignclient.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class PaymentResource {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment/fetch")
    ResponseEntity<String> fetchPaymentDetails(){
        return paymentService.fetchPaymentDetails();
    }
}
