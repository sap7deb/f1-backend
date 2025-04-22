package com.f1.api.dto;

public record ConstructorDTO(
        Integer constructorId,
        String country,
        String name,
        String full_name
) {}