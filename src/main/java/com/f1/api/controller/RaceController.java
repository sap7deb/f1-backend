package com.f1.api.controller;

import com.f1.api.dto.RaceDTO;
import com.f1.api.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/races")
public class RaceController {
    @Autowired
    private RaceService service;

    @GetMapping
    public List<RaceDTO> getAllRaces() {
        return service.getAllRaces();
    }
}
