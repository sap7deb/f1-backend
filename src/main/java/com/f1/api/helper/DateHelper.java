package com.f1.api.helper;

import lombok.extern.slf4j.Slf4j;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

@Slf4j
public class DateHelper {

    public static String getCurrentUTCTime(){
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneOffset.UTC);
        String formattedDate = utcNow.toLocalDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        log.info("Current UTC Date: {}",formattedDate);
        return formattedDate;
    }
}
