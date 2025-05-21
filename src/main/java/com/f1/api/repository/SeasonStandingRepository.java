package com.f1.api.repository;

import com.f1.api.entity.SeasonStanding;
import com.f1.api.entityData.SeasonStandingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeasonStandingRepository extends JpaRepository<SeasonStanding, SeasonStandingId> {

    List<SeasonStanding> findByYear(Integer year);
}
