package com.example.CRUDApp.repository;

import com.example.CRUDApp.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
