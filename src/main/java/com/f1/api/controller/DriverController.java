package com.f1.api.controller;

import com.f1.api.dto.DriverDTO;
import com.f1.api.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/drivers")
public class DriverController {
    @Autowired
    private DriverService service;

    @GetMapping
    public List<DriverDTO> getAllDrivers() {
        return service.getAllDrivers();
    }
}
