package com.f1.api.repository;

import com.f1.api.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Integer> {
    List<Season> findByYearGreaterThanEqual(Integer year);
    List<Season> findByYearLessThanEqual(Integer year);
}
