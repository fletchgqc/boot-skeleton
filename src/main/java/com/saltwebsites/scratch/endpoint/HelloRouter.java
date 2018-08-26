package com.saltwebsites.scratch.endpoint;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@AllArgsConstructor
public class HelloRouter {
  public static final String HELLO = "/hello";

  private final HelloHandler helloHandler;

  @Bean
  public RouterFunction<ServerResponse> getHello() {
    return route(GET(HELLO), helloHandler::getHelloWorld);
  }
}
