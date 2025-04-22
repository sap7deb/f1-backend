package com.f1.api.repository;

import com.f1.api.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceRepository extends JpaRepository<Race, Integer> {
    List<Race> findByYear(Integer year);
    List<Race> findByYearAndRound(Integer year, Integer round);
    List<Race> findByCircuitId(Integer circuitId);
    List<Race> findByNameContainingIgnoreCase(String name);
}