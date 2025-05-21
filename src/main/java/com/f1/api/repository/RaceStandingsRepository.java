package com.f1.api.repository;

import com.f1.api.entity.RaceDriverStanding;
import com.f1.api.entityData.RaceStandingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RaceStandingsRepository extends JpaRepository<RaceDriverStanding, RaceStandingId> {

    List<RaceDriverStanding> findByRaceId(Integer raceId);
}
