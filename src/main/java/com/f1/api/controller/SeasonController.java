package com.f1.api.controller;

import com.f1.api.dto.SeasonDTO;
import com.f1.api.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/seasons")
public class SeasonController {
    @Autowired
    private SeasonService service;

    @GetMapping
    public List<SeasonDTO> getSeasons() {
        return service.getAllSeasons();
    }
}
