package ru.microservices.common.common_service.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

@UtilityClass
public class DateTimeUtil {
    public Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault())
                .toInstant());
    }

    public LocalDateTime atStartOfDayOrNull(LocalDate date) {
        if (date == null) {
            return null;
        } else {
            return date.atStartOfDay();
        }
    }

    public Optional<LocalDateTime> atStartOfDayOptional(LocalDate date) {
        if (date == null) {
            return Optional.empty();
        } else {
            return Optional.of(date.atStartOfDay());
        }
    }
}
