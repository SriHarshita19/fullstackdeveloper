package com.cts.training.companyservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="initialpublicoffering-service")
public interface InitialPublicOfferingServiceProxy {
@GetMapping("/ipoall")
public ResponseEntity<?>getallusers();
}
