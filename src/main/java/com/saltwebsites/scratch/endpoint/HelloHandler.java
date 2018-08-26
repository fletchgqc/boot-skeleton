package com.saltwebsites.scratch.endpoint;

import java.time.format.DateTimeFormatter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Slf4j
@Component
@AllArgsConstructor
public class HelloHandler {

  private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");

  public Mono<ServerResponse> getHelloWorld(ServerRequest request) {
    log.debug("Triggering hello world");

    return ServerResponse.ok().syncBody(new World("hello"));
  }
}
