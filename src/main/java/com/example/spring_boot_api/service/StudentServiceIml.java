package com.example.spring_boot_api.service;

import com.example.spring_boot_api.repository.StudentRepository;
import com.example.springboot_main.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceIml implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll() ;
    }

    @Override
    public Student findById(long id) {
        Optional<Student> rs= studentRepository.findById(Long.valueOf(id));
        Student s=null;
        if(rs.isPresent()){
            s=rs.get();

        }else{
            throw new RuntimeException("did not find");
        }
        return s;


    }

    @Override
    public void deleteById(long id) {
        studentRepository.deleteById(Long.valueOf(id));

    }

    @Override
    public Student saveStudent(Student student) {
        return (Student) studentRepository.findAll();
    }
}
