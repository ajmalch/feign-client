package com.example.feignclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("config-client-sample")
public interface FeignClientSample {

    @GetMapping("/config-client/sayHi")
    String hello();
}
