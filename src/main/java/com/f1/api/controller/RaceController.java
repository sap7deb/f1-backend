package com.f1.api.controller;

import com.f1.api.dto.RaceDTO;
import com.f1.api.dto.ResultDTO;
import com.f1.api.entity.Race;
import com.f1.api.service.RaceService;
import com.f1.api.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/races")
public class RaceController {
    @Autowired
    private RaceService service;

    @Autowired
    private ResultService resultService;

    @GetMapping
    public List<RaceDTO> getAllRaces() {
        return service.getAllRaces();
    }

    @GetMapping("/{id}")
    public RaceDTO getRaceById(@PathVariable Integer id) {
        return service.getRaceById(id);
    }

    @GetMapping("/year/{year}")
    public List<RaceDTO> getRacesByYear(@PathVariable Integer year) {
        return service.getRacesByYear(year);
    }

    @GetMapping("/circuit/{circuitId}")
    public List<RaceDTO> getRacesByCircuit(@PathVariable String circuitId) {
        return service.getRacesByCircuit(circuitId);
    }

    @GetMapping("/{id}/results")
    public List<ResultDTO> getRaceResults(@PathVariable Integer id) {
        return resultService.getResultsByRaceId(id);
    }

    @GetMapping("/winners/{year}")
    public List<Map<String, Object>> getWinnersByYear(@PathVariable Integer year) {
        return resultService.getWinnersByYear(year);
    }
}
