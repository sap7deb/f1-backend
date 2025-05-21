package com.f1.api.repository;

import com.f1.api.entity.ConstructorStanding;
import com.f1.api.entity.SeasonStanding;
import com.f1.api.entityData.ConstructorStandingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConstructorStandingRepository extends JpaRepository<ConstructorStanding, ConstructorStandingId> {

    List<ConstructorStanding> findByYear(Integer year);
}
