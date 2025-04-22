package com.f1.api.service;

import com.f1.api.dto.ConstructorDTO;
import com.f1.api.entity.Constructor;
import com.f1.api.repository.ConstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstructorService {
    @Autowired
    private ConstructorRepository repository;

    public List<ConstructorDTO> getAllConstructors() {
        return repository.findAll().stream()
                .map(c -> new ConstructorDTO(
                        c.getId(),
                        c.getName(),
                        c.getCountry(),
                        c.getFull_name()
                )).toList();
    }
}
