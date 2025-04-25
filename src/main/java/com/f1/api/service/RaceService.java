package com.f1.api.service;

import com.f1.api.dto.RaceDTO;
import com.f1.api.entity.Race;
import com.f1.api.repository.RaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RaceService {
    @Autowired
    private RaceRepository repository;

    public List<RaceDTO> getAllRaces() {
        return repository.findAll().stream().map(r -> new RaceDTO(
                r.getRaceId(), r.getCircuitId(), r.getYear(), r.getRound(), r.getName(), r.getDate(), r.getTime()
        )).toList();
    }

    public RaceDTO getRaceById(Integer id) {
        Race r = repository.findById(id).orElseThrow();
        return new RaceDTO(r.getRaceId(), r.getCircuitId(), r.getYear(), r.getRound(), r.getName(), r.getDate(), r.getTime());
    }

    public List<RaceDTO> getRacesByYear(Integer year) {
        return repository.findByYear(year).stream().map(r -> new RaceDTO(
                r.getRaceId(), r.getCircuitId(), r.getYear(), r.getRound(), r.getName(), r.getDate(), r.getTime()
        )).toList();
    }

    public List<RaceDTO> getRacesByCircuit(String circuitId) {
        return repository.findByCircuitId(circuitId).stream().map(r -> new RaceDTO(
                r.getRaceId(), r.getCircuitId(), r.getYear(), r.getRound(), r.getName(), r.getDate(), r.getTime()
        )).toList();
    }
}
