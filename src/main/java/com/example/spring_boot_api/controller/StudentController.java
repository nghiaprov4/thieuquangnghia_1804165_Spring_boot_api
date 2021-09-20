package com.example.spring_boot_api.controller;

import com.example.spring_boot_api.erro.StudentNotFoundException;
import com.example.spring_boot_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/student{id}")
    public com.example.springboot_main.entity.Student getStudentById(@PathVariable("id") Long id) throws StudentNotFoundException {

        return studentService.getStudentId(id);
    }

}
