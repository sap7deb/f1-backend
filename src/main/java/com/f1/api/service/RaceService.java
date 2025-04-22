package com.f1.api.service;

import com.f1.api.dto.RaceDTO;
import com.f1.api.entity.Race;
import com.f1.api.repository.RaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RaceService {
  //  @Autowired
    private final RaceRepository repository;

    public List<RaceDTO> getAllRaces() {
        return repository.findAll().stream().map(r -> new RaceDTO(
                r.getRaceId(), r.getYear(), r.getRound(), r.getName(), r.getDate(), r.getTime()
        )).toList();
    }
}
