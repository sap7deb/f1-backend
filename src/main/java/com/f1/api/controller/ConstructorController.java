package com.f1.api.controller;

import com.f1.api.dto.ConstructorDTO;
import com.f1.api.dto.ConstructorStandingDTO;
import com.f1.api.dto.SeasonStandingsDTO;
import com.f1.api.service.ConstructorService;
import com.f1.api.service.ConstructorStandingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/constructors")
public class ConstructorController {
    @Autowired
    private ConstructorService service;

    @Autowired
    private ConstructorStandingService constructorStandingService;

    @GetMapping
    public List<ConstructorDTO> getAllConstructors() {
        return service.getAllConstructors();
    }

    @GetMapping("/standing/{year}")
    public List<ConstructorStandingDTO> getStandingsByYear(@PathVariable Integer year) {
        return constructorStandingService.getConstructorStandingByYear(year);
    }
}
