package com.example.spring_boot_api.controller;

import com.example.spring_boot_api.DTO.StudentDTO;
import com.example.spring_boot_api.entity.Student;
import com.example.spring_boot_api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    public List<StudentDTO>getListStudent() {
        List<Student> users = studentService.getListStudent();
        List<StudentDTO> dtoList = new ArrayList<>();
        for (Student student : users) {
            dtoList.add(new StudentDTO(student));
            dtoList.add(new StudentDTO(student));
        }
        return dtoList;
    }

}
