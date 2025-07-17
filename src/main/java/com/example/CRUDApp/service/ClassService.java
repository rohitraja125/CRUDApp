package com.example.CRUDApp.service;

import com.example.CRUDApp.model.ClassEntity;
import java.util.List;

public interface ClassService {
    List<ClassEntity> getAllClasses();
    ClassEntity getClassById(Long id);
    ClassEntity createClass(ClassEntity classEntity);
    ClassEntity updateClass(Long id, ClassEntity classEntity);
    void deleteClass(Long id);
}
