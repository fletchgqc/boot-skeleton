package com.saltwebsites.scratch.service;

import javax.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class HelloService {

  @PostConstruct
  public void init() {
    log.info("running init");
  }
}
