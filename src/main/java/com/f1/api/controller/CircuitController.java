package com.f1.api.controller;

import com.f1.api.dto.CircuitDTO;
import com.f1.api.service.CircuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/circuits")
public class CircuitController {

    @Autowired
    private CircuitService service;

    @GetMapping
    public List<CircuitDTO> getAllCircuits() {
        return service.getAllCircuits();
    }
}
