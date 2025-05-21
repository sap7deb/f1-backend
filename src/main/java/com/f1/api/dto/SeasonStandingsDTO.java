package com.f1.api.dto;

public record SeasonStandingsDTO (
        Integer year,
        String driverId,
        Integer position,
        Integer points
) {
}
