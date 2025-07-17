package com.example.CRUDApp.repository;

import com.example.CRUDApp.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
