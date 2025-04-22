package com.f1.api.service;

import com.f1.api.dto.CircuitDTO;
import com.f1.api.entity.Circuit;
import com.f1.api.repository.CircuitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CircuitService {

  //  @Autowired
    private final CircuitRepository repository;

    public List<CircuitDTO> getAllCircuits() {
        return repository.findAll().stream()
                .map(c -> new CircuitDTO(
                        c.getId(),
                        c.getPlaceName(),
                        c.getName(),
                        c.getCountry(),
                        c.getLatitude(),
                        c.getLongitude(),
                        c.getTurns()
                       ))
                .toList();
    }
}
