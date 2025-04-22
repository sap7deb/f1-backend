package com.f1.api.controller;

import com.f1.api.dto.ConstructorDTO;
import com.f1.api.service.ConstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/constructors")
public class ConstructorController {
    @Autowired
    private ConstructorService service;

    @GetMapping
    public List<ConstructorDTO> getAllConstructors() {
        return service.getAllConstructors();
    }
}
