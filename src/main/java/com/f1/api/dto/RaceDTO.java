package com.f1.api.dto;

import java.time.LocalDate;

public record RaceDTO(
        Integer raceId,
        String circuitId,
        Integer year,
        Integer round,
        String name,
        String date,
        String time
) {}