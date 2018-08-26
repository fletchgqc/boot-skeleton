package com.saltwebsites.scratch.config;

import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/** Class to provide programmatic access to application.properties */
@Data
@Component
@Validated
@NoArgsConstructor
@ConfigurationProperties(prefix = "scratch")
public class ApplicationProperties {

  @Data
  @NoArgsConstructor
  public static class Something {

    @NotEmpty private String host;
  }
}
