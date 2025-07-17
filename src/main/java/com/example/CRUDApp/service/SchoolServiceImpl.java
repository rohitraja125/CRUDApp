package com.example.CRUDApp.service;

import com.example.CRUDApp.model.School;
import com.example.CRUDApp.repository.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    @Override
    public School getSchoolById(Long id) {
        return schoolRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("School not found with id " + id));
    }

    @Override
    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public School updateSchool(Long id, School updatedSchool) {
        School existing = getSchoolById(id);
        existing.setName(updatedSchool.getName());
        return schoolRepository.save(existing);
    }

    @Override
    public void deleteSchool(Long id) {
        schoolRepository.deleteById(id);
    }
}
