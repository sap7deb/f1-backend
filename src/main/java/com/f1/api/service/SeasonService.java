package com.f1.api.service;

import com.f1.api.dto.SeasonDTO;
import com.f1.api.repository.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeasonService {
   // @Autowired
    private final SeasonRepository repository;

    public List<SeasonDTO> getAllSeasons() {
        return repository.findAll().stream()
                .map(season -> new SeasonDTO(season.getYear()))
                .toList();
    }
}
