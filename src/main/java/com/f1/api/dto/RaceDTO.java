package com.f1.api.dto;

import java.time.LocalDate;

public record RaceDTO(
        Integer raceId,
        Integer year,
        Integer round,
        String name,
        String date,
        String time
) {}