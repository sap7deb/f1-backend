package com.f1.api.dto;

public record DriverDTO(
        String driverId,
        String code,
        String firstname,
        String lastname,
        String dob,
        String nationality) {}