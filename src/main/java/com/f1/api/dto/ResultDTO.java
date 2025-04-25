package com.f1.api.dto;

public record ResultDTO(
        Integer raceId,
        String driverId,
        Integer constructorId,
        Integer position,
        Integer points
) {}
