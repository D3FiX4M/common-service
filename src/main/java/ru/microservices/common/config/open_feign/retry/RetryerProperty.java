package ru.microservices.common.config.open_feign.retry;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "retry.settings")
public class RetryerProperty {
    private Long period = 50L;
    private Long maxPeriod = 1000L;
    private Integer maxAttempts = 10;
}