package com.f1.api.dto;

public record CircuitDTO(
        String circuitId,
        String name,
        String placeName,
        String country,
        Double latitude,
        Double longitude,
        Double turns
) {
}
