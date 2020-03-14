package com.cts.training.sectorservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("netflix-zuul-api-gateway-server")
public interface RegisterServiceProxy {
@GetMapping("/register-service/register")
public ResponseEntity<?>getallusers();
}
