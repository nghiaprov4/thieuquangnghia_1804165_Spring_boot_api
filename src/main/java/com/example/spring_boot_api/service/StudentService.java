package com.example.spring_boot_api.service;

import com.example.spring_boot_api.entity.Student;

import java.util.List;

public interface StudentService {
    void saveStudent(Student s);
    List<Student> findAll();
    Student findById(long id);
    void deleteById(long id);

    List<Student> getListStudent();

    ;

}
