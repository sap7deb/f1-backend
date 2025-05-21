package com.f1.api.service;

import com.f1.api.dto.ConstructorStandingDTO;
import com.f1.api.repository.ConstructorStandingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstructorStandingService {

    @Autowired
    private ConstructorStandingRepository constructorStandingRepository;

    public List<ConstructorStandingDTO> getConstructorStandingByYear(Integer year) {
        return constructorStandingRepository.findByYear(year).stream()
                .map(r -> new ConstructorStandingDTO(
                        r.getYear(), r.getConstructor_id(), r.getEngine_manufacturer_id(), r.getPosition(), r.getPoints())
                ).toList();
    }
}
