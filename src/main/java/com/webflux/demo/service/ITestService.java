package com.webflux.demo.service;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface ITestService {

    Mono<ServerResponse> data(ServerRequest request);
}
