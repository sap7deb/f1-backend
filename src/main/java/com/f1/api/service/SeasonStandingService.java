package com.f1.api.service;

import com.f1.api.dto.RaceStandingsDTO;
import com.f1.api.dto.SeasonStandingsDTO;
import com.f1.api.repository.SeasonStandingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonStandingService {

    @Autowired
    private SeasonStandingRepository seasonStandingRepository;

    public List<SeasonStandingsDTO> getDriverStandingsByRaceId(Integer year){
        return seasonStandingRepository.findByYear(year).stream().map(r->
                new SeasonStandingsDTO(r.getYear(),r.getDriverId(),r.getPosition(),r.getPoints())
        ).toList();
    }
}
