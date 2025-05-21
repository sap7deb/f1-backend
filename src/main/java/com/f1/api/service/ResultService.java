package com.f1.api.service;

import com.f1.api.dto.ResultDTO;
import com.f1.api.entity.Race;
import com.f1.api.entity.Result;
import com.f1.api.repository.ConstructorRepository;
import com.f1.api.repository.DriverRepository;
import com.f1.api.repository.RaceRepository;
import com.f1.api.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class ResultService {
    @Autowired
    private ResultRepository resultRepository;

    @Autowired
    private RaceRepository raceRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private ConstructorRepository constructorRepository;

    public List<ResultDTO> getResultsByRaceId(Integer raceId) {
        return resultRepository.findByRaceId(raceId).stream()
                .filter(r -> "RACE_RESULT".equalsIgnoreCase(r.getType()))
                .filter(r -> r.getPosition() != null && r.getPosition() > 0)
                .map(r -> new ResultDTO(
                        r.getRaceId(),
                        r.getDriverId(),
                        r.getConstructorId(),
                        r.getPosition(),
                        r.getPoints(),
                        r.getLapTime(),
                        r.getRaceGap()))
                .toList();
    }

    public List<Map<String, Object>> getWinnersByYear(Integer year) {
        // Get all race IDs for the given year
        List<Integer> raceIdsForYear = raceRepository.findByYear(year).stream()
                .map(Race::getRaceId)
                .toList();


        return resultRepository.findAll().stream()
                .filter(r -> r.getPosition() != null && r.getPosition() == 1)
                .filter(r -> "RACE_RESULT".equalsIgnoreCase(r.getType()))
                .filter(r -> raceIdsForYear.contains(r.getRaceId()))
                .map(r -> {
                    Map<String, Object> winnerMap = new LinkedHashMap<>();
                    winnerMap.put("raceId", r.getRaceId());
                    winnerMap.put("position", r.getPosition());
                    winnerMap.put("points", r.getPoints());

                    driverRepository.findById(r.getDriverId())
                            .ifPresent(d -> {
                                winnerMap.put("driver", d.getFirstname() + " " + d.getLastname());
                                winnerMap.put("nationality", d.getNationality());
                            });

                    constructorRepository.findById(r.getConstructorId())
                            .ifPresent(c -> {
                                winnerMap.put("constructor", c.getName());
                            });

                    return winnerMap;
                })
                .toList();
    }

    public List<Map<String, Object>> getRacePodiums(){
        Integer raceId = resultRepository.getLatestRaceId();

        return resultRepository.findAll().stream()
                .filter(r -> "RACE_RESULT".equalsIgnoreCase(r.getType()))
                .filter(r -> raceId.equals(r.getRaceId()))
                .limit(3)
                .map(r -> {
                    Map<String, Object> winnerMap = new LinkedHashMap<>();
                    winnerMap.put("raceId", r.getRaceId());
                    winnerMap.put("position", r.getPosition());
                    winnerMap.put("points", r.getPoints());
                    winnerMap.put("LapTime", r.getLapTime());
                    winnerMap.put("RaceGap", r.getRaceGap());

                    driverRepository.findById(r.getDriverId())
                            .ifPresent(d -> {
                                winnerMap.put("driver", d.getFirstname() + " " + d.getLastname());
                                winnerMap.put("nationality", d.getNationality());
                            });

                    constructorRepository.findById(r.getConstructorId())
                            .ifPresent(c -> {
                                winnerMap.put("constructor", c.getName());
                            });

                    return winnerMap;
                })
                .toList();

    }
}
