package com.f1.api.dto;

public record RaceStandingsDTO(
        Integer raceId,
        String driverId,
        Integer position,
        Integer points
) {}
