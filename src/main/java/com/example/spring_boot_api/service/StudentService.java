package com.example.spring_boot_api.service;

import com.example.springboot_main.entity.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student s);
    List<Student> findAll();
    Student findById(long id);
    void deleteById(long id);
}
