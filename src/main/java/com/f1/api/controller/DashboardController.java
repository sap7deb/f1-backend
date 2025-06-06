package com.f1.api.controller;

import com.f1.api.dto.RaceDTO;
import com.f1.api.dto.ResultDTO;
import com.f1.api.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/dashboard")
public class DashboardController {

    @Autowired
    private ResultService resultService;

    @GetMapping("/lastest/race/podiums")
    public List<Map<String, Object>> getLatestRacePodiums() {
        return resultService.getRacePodiums();
    }
}
