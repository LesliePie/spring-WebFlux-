package com.webflux.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class TestController {


    @GetMapping(value = "/hello")
    public Mono<String> hello(){
        return Mono.just("hello");
    }



}
