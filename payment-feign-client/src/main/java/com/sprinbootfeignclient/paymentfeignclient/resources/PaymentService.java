package com.sprinbootfeignclient.paymentfeignclient.resources;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("PAYMENT-SERVICE")
public interface PaymentService {

    @GetMapping("/payment/fetch")
    ResponseEntity<String> fetchPaymentDetails();
}
