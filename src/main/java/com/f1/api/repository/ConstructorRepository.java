package com.f1.api.repository;

import com.f1.api.entity.Constructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConstructorRepository extends JpaRepository<Constructor, Integer> {

}
