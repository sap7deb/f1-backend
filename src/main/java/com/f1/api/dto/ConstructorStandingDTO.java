package com.f1.api.dto;

public record ConstructorStandingDTO(
        Integer year,
        String constructorId,
        String engineManufacturerId,
        Integer position,
        Integer points
)
{}