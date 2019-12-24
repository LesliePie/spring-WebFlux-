package com.webflux.demo.service;

import org.springframework.http.MediaType;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;

@Service

public class TestServiceImpl implements ITestService {


    @Override
    public Mono<ServerResponse> data(ServerRequest request) {
        Mono<String> momo=Mono.justOrEmpty(request.queryParam("data"))
                .defaultIfEmpty("null")
                .map(i->i.concat("  hhhhhhhhhh"));
        return ServerResponse.ok().body(momo, String.class);
    }
   /* public RouterFunction<ServerResponse> responseRouterFunction(){
        return RouterFunctions.route(RequestPredicates.GET("/h1")
                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON_UTF8)),ITestService::data(a) );
    }*/
}
