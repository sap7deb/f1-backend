package com.f1.api.service;

import com.f1.api.dto.RaceStandingsDTO;
import com.f1.api.repository.RaceStandingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceStandingService {

    @Autowired
    private RaceStandingsRepository raceStandingsRepository;

    public List<RaceStandingsDTO> getDriverStandingsByRaceId(Integer raceId){
        return raceStandingsRepository.findByRaceId(raceId).stream().map(r->
                new RaceStandingsDTO(r.getRaceId(),r.getDriverId(),r.getPosition(),r.getPoints())
        ).toList();
    }
}
