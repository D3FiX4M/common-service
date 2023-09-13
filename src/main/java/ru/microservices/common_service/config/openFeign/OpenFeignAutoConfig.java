package ru.microservices.common_service.config.openFeign;

import feign.Retryer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.microservices.common_service.config.openFeign.retry.RetryerConfig;
import ru.microservices.common_service.config.openFeign.retry.RetryerProperty;

@Configuration
public class OpenFeignAutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public RetryerProperty retryerProperty() {
        return new RetryerProperty();
    }

    @Bean
    @ConditionalOnMissingBean
    public Retryer retryer(RetryerProperty property) {
        return new RetryerConfig(property);
    }

}