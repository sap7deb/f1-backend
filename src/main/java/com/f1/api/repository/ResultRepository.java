package com.f1.api.repository;

import com.f1.api.entity.Result;
import com.f1.api.entityData.ResultId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, ResultId    > {
//    List<Result> findByRaceId(Integer raceId);
//    List<Result> findByDriverId(Integer driverId);
//    List<Result> findByConstructorId(Integer constructorId);
//
//    @Query("SELECT r FROM race_data r WHERE r.race_id = :raceId ORDER BY r.position_number ASC")
//    List<Result> findRaceResults(@Param("raceId") Integer raceId);
//
//    @Query("SELECT r FROM race_data r JOIN r.race race WHERE race.year = :year AND r.position_number = 1")
//    List<Result> findRaceWinnersByYear(@Param("year") Integer year);

    List<Result> findByRaceId(Integer raceId);

    @Query("SELECT r FROM Result r WHERE r.position = 1 AND r.type = 'RACE_RESULT' AND r.raceId IN :raceIds")
    List<Result> findWinnersForRaces(@Param("raceIds") List<Integer> raceIds);

    @Query("SELECT r.raceId FROM Result r WHERE r.type = 'RACE_RESULT' ORDER BY r.raceId DESC LIMIT 1")
    Integer getLatestRaceId();
}