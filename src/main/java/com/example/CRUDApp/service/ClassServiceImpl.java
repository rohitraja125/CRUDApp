package com.example.CRUDApp.service;

import com.example.CRUDApp.model.ClassEntity;
import com.example.CRUDApp.repository.ClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    private final ClassRepository classRepository;

    public ClassServiceImpl(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @Override
    public List<ClassEntity> getAllClasses() {
        return classRepository.findAll();
    }

    @Override
    public ClassEntity getClassById(Long id) {
        return classRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Class not found with id " + id));
    }

    @Override
    public ClassEntity createClass(ClassEntity classEntity) {
        return classRepository.save(classEntity);
    }

    @Override
    public ClassEntity updateClass(Long id, ClassEntity updatedClass) {
        ClassEntity existing = getClassById(id);
        existing.setName(updatedClass.getName());
        existing.setSchool(updatedClass.getSchool());
        existing.setSubject(updatedClass.getSubject());
        existing.setTeacher(updatedClass.getTeacher());
        existing.setStudents(updatedClass.getStudents());
        return classRepository.save(existing);
    }

    @Override
    public void deleteClass(Long id) {
        classRepository.deleteById(id);
    }
}
