package com.example.CRUDApp.service;

import com.example.CRUDApp.model.Teacher;
import com.example.CRUDApp.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Teacher not found with id " + id));
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher updateTeacher(Long id, Teacher updatedTeacher) {
        Teacher existing = getTeacherById(id);
        existing.setName(updatedTeacher.getName());
        existing.setSchool(updatedTeacher.getSchool());
        existing.setSubjects(updatedTeacher.getSubjects());
        existing.setClasses(updatedTeacher.getClasses());
        return teacherRepository.save(existing);
    }

    @Override
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
