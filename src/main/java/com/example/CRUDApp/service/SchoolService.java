package com.example.CRUDApp.service;

import com.example.CRUDApp.model.School;
import java.util.List;

public interface SchoolService {
    List<School> getAllSchools();
    School getSchoolById(Long id);
    School createSchool(School school);
    School updateSchool(Long id, School school);
    void deleteSchool(Long id);
}
