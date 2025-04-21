package com.f1.api.service;

import com.f1.api.dto.CircuitDTO;
import com.f1.api.entity.Circuit;
import com.f1.api.repository.CircuitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CircuitService {

    @Autowired
    private CircuitRepository repository;

    public List<CircuitDTO> getAllCircuits() {
        return repository.findAll().stream()
                .map(c -> new CircuitDTO(
                        c.getCircuitId(),
                        c.getName(),
                        c.getLocation(),
                        c.getCountry(),
                        c.getUrl()))
                .toList();
    }
}
