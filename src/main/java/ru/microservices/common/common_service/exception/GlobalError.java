package ru.microservices.common.common_service.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum GlobalError {

    // COMMON
    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR),
    NOT_FOUND_ERROR(HttpStatus.NOT_FOUND),
    ALREADY_EXIST_ERROR(HttpStatus.FOUND),
    PARSER_ERROR(HttpStatus.BAD_REQUEST),
    BAD_REQUEST_ERROR(HttpStatus.BAD_REQUEST),
    NOT_ALLOWED_ERROR(HttpStatus.METHOD_NOT_ALLOWED),
    BAD_CREDENTIALS(HttpStatus.FORBIDDEN),
    ACCESS_ERROR(HttpStatus.FORBIDDEN);

    private final HttpStatus status;
}
