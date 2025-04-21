package com.f1.api.dto;

public record CircuitDTO(
        Integer circuitId,
        String name,
        String location,
        String country,
        String url
) {}
