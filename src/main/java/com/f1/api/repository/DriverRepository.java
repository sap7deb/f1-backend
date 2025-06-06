package com.f1.api.repository;

import com.f1.api.entity.Driver;
import com.f1.api.entity.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String> {

}
