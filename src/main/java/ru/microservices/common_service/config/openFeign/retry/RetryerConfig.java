package ru.microservices.common_service.config.openFeign.retry;

import feign.RetryableException;
import feign.Retryer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RetryerConfig implements Retryer {

    private final RetryerProperty property;


    @Override
    public void continueOrPropagate(RetryableException e) {
        throw e;
    }

    @Override
    public Retryer clone() {
        return new Retryer.Default(
                property.getPeriod(),
                property.getMaxPeriod(),
                property.getMaxAttempts()
        );
    }
}
