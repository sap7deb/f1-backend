package com.f1.api.service;

import com.f1.api.dto.DriverDTO;
import com.f1.api.entity.Driver;
import com.f1.api.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    private DriverRepository repository;

    public List<DriverDTO> getAllDrivers() {
        return repository.findAll().stream()
                .map(d -> new DriverDTO(
                        d.getDriverId(),
                        d.getCode(),
                        d.getFirstname(),
                        d.getLastname(),
                        d.getDob(),
                        d.getNationality()
                )).toList();
    }
}
